class GenerateLLVM {
    static int reg = 1;

    private static String header_text = "";
    private static String main_text = "";
    private static String buffer = "";
    private static int str_i = 0;
    private static int main_reg = 1;
    private static int br = 0;


    static String generate() {
        main_text += buffer;
        formatMainText();
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @scanf(i8*, ...)\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n";
        text += "@strsi = constant [3 x i8] c\"%d\\00\"\n";
        text += "@strsd = constant [4 x i8] c\"%lf\\00\"\n";
        text += "\n";
        text += header_text;
        text += "define i32 @main() nounwind {\n";
        text += main_text;
        text += "  ret i32 0\n";
        text += "}\n";
        return text;
    }

    //declare


    static void function_start(String id) {
        main_text += buffer;
        main_reg = reg;
        buffer = "define void @" + id + "() nounwind {\n";
        reg = 1;
    }

    static void function_end() {
        buffer += "ret void\n";
        formatBuffer();
        buffer += "}\n\n";
        header_text += buffer;
        buffer = "";
        reg = main_reg;
    }

    static void call(String id) {
        buffer += "call void @" + id + "()\n";

    }

    //declare

    static void declare_string(String ident, String value, boolean global, String procedure) {
        int len = value.length() + 1;
        String str_type = "[" + len + " x i8]";
        if (global) {
            header_text += "@" + ident + " = constant" + str_type + " c\"" + value + "\\00\"\n";
        } else {
            header_text += "@" + procedure + "." + ident + " = constant" + str_type + " c\"" + value + "\\00\"\n";
        }
    }

    static void declare_global_i64(String ident, String value) {
        header_text += "@" + ident + " = global i64 " + value + "\n";
    }

    static void declare_alloca_i64(String ident) {
        buffer += "%" + ident + " = alloca i64\n";
    }

    static void declare_global_double(String ident, String value) {
        header_text += "@" + ident + " = global double " + value + "\n";
    }

    static void declare_alloca_double(String ident) {
        buffer += "%" + ident + " = alloca double\n";
    }

    static void declare_global_bool(String ident, String value) {
        header_text += "@" + ident + " = global i1 " + value + "\n";
    }

    static void declare_alloca_bool(String ident) {
        buffer += "%" + ident + " = alloca i1\n";
    }


    //assign

    static void assign_i64(String ident, String value, boolean global) {
        if (global) {
            buffer += "store i64 " + value + ", i64* @" + ident + "\n";
        }
        else {
            buffer += "store i64 " + value + ", i64* %" + ident + "\n";
        }
    }

    static void assign_double(String ident, String value, boolean global) {
        if (global) {
            buffer += "store double " + value + ", double* @" + ident + "\n";
        }
        else {
            buffer += "store double " + value + ", double* %" + ident + "\n";
        }
    }

    static void assign_bool(String ident, String value, boolean global) {
        if (global) {
            buffer += "store i1 " + value + ", i1* @" + ident + "\n";
        }
        else {
            buffer += "store i1 " + value + ", i1* %" + ident + "\n";
        }
    }

    //print
    static int print(String text) {
        int str_len = text.length();
        String str_type = "[" + (str_len + 2) + " x i8]";
        header_text += "@str" + str_i + " = constant" + str_type + " c\"" + text + "\\0A\\00\"\n";
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( " + str_type + ", " + str_type + "* @str" + str_i + ", i32 0, i32 0))\n";
        str_i++;
        reg++;
        return  str_i - 1;
    }

    static int print(String text, int pos) {
        int str_len = text.length();
        String str_type = "[" + (str_len + 2) + " x i8]";
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( " + str_type + ", " + str_type + "* @str" + pos + ", i32 0, i32 0))\n";
        reg++;
        return pos;
    }


    static void print_i64(String text) {
        buffer += "%" + reg + " = add i64 0, " + text + "\n";
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i64 %" + (reg - 1) + ")\n";
        reg++;
    }

    static void print_double(String text) {
        buffer += "%" + reg + " = fadd double 0.0, " + text + "\n";
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %" + (reg - 1) + ")\n";
        reg++;
    }

    static void print_bool(String text) {
        buffer += "%" + reg + " = and i1 " + text + ", " + text + "\n";
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i1 %" + (reg - 1) + ")\n";
        reg++;
    }

    static void print_string(String ident, int length, boolean global, String procedure) {
        if (global) {
            buffer += "%" + reg + " = getelementptr inbounds [" + (length + 1) + " x i8], [" + (length + 1) + " x i8]* @" + ident + ", i32 0, i32 0\n";
        } else {
            buffer += "%" + reg + " = getelementptr inbounds [" + (length + 1) + " x i8], [" + (length + 1) + " x i8]* @" + procedure + "." + ident + ", i32 0, i32 0\n";
        }
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %" + (reg - 1) + ")\n";
        reg++;
    }


    static void print_declare_i64(String ident, boolean global) {
        if (global) {
            buffer += "%" + reg + " = load i64, i64* @" + ident + "\n";
        }
        else {
            buffer += "%" + reg + " = load i64, i64* %" + ident + "\n";
        }
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i64 %" + (reg - 1) + ")\n";
        reg++;
    }

    static void print_declare_double(String ident, boolean global) {
        if (global) {
            buffer += "%" + reg + " = load double, double* @" + ident + "\n";
        }
        else {
            buffer += "%" + reg + " = load double, double* %" + ident + "\n";
        }
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %" + (reg - 1) + ")\n";
        reg++;
    }

    static void print_declare_bool(String ident, boolean global) {
        if (global) {
            buffer += "%" + reg + " = load i1, i1* @" + ident + "\n";
        }
        else {
            buffer += "%" + reg + " = load i1, i1* %" + ident + "\n";
        }
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i1 %" + (reg - 1) + ")\n";
        reg++;
    }



    private static void formatMainText() {
        String[] lines = main_text.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append("  ").append(line).append("\n");
        }
        main_text = sb.toString();
    }


    private static void formatBuffer() {
        String[] lines = buffer.split("\n");
        StringBuilder sb = new StringBuilder();
        sb.append(lines[0]).append("\n");
        for (int i = 1; i < lines.length; i++) {
            sb.append("  ").append(lines[i]).append("\n");
        }
        buffer = sb.toString();
    }
}
