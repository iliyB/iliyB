import java.io.FileWriter;
import java.util.Stack;

class GenerateLLVM {
    static int reg = 0;

    private static String header_text = "";
    private static String main_text = "";
    private static String buffer = "";
    private static int str_i = 0;
    private static int main_reg = 0;
    private static int br = 0;
    static Stack<Integer> br_loop= new Stack<>();
    static boolean stack_pop;

    static Stack<Integer> br_stack = new Stack<>();


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
        text += "\n\ndefine i32 @main() nounwind {\n";
        text += "entry:\n";
        text += main_text;
        text += "  ret i32 0\n";
        text += "}\n";
        try(FileWriter writer = new FileWriter("/home/iliy/llvm/hello.ll", false)) {
            writer.write(text);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }

    //declare


    static void function_start(String id) {
        main_text += buffer;
        main_reg = reg;
        buffer = "\n\ndefine void @" + id + "() nounwind {\n";
        buffer += "entry:\n";
        reg = 0;
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

    static void declare_global_int(String ident, String value) {
        header_text += "@" + ident + " = global i64 " + value + "\n";
    }

    static void declare_alloca_int(String ident) {
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

    static void assign_int(String ident, String value, boolean global) {
        if (global) {
            buffer += "store i64 " + value + ", i64* @" + ident + "\n";
        }
        else {
            buffer += "store i64 " + value + ", i64* %" + ident + "\n";
        }
    }
    static void assign_int(String ident, int ref, boolean global) {
        if (global) {
            buffer += "store i64 %" + ref + ", i64* @" + ident + "\n";
        }
        else {
            buffer += "store i64 %" + ref + ", i64* %" + ident + "\n";
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
    static void assign_double(String ident, int ref, boolean global) {
        if (global) {
            buffer += "store double %" + ref + ", double* @" + ident + "\n";
        }
        else {
            buffer += "store double %" + ref + ", double* %" + ident + "\n";
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
    static void assign_bool(String ident, int ref, boolean global) {
        if (global) {
            buffer += "store i1 %" + ref + ", i1* @" + ident + "\n";
        }
        else {
            buffer += "store i1 %" + ref + ", i1* %" + ident + "\n";
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


    static void print_int(String text) {
        buffer += "%" + reg + " = add i64 0, " + text + "\n";
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i64 %" + (reg - 1) + ")\n";
        reg++;
    }
    static void print_int(int ref) {
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i64 %" + ref + ")\n";
        reg++;
    }

    static void print_double(String text) {
        buffer += "%" + reg + " = fadd double 0.0, " + text + "\n";
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %" + (reg - 1) + ")\n";
        reg++;
    }
    static void print_double(int ref) {
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %" + ref + ")\n";
        reg++;
    }

    static void print_bool(String text) {
        buffer += "%" + reg + " = and i1 " + text + ", " + text + "\n";
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i1 %" + (reg - 1) + ")\n";
        reg++;
    }
    static void print_bool(int ref) {
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i1 %" + ref + ")\n";
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

    //translate

    static int translate_int_to_float(int _reg) {
        buffer += "%" + reg + " = sitofp i64 %" + _reg + " to double\n";
        reg++;
        return reg - 1;
    }

    static int translate_float_to_int(int _reg) {
        buffer += "%" + reg + " = fptosi double %" + _reg + " to i64\n";
        reg++;
        return reg - 1;
    }

    //op

    static int sum_int(int ref1, int ref2) {
        buffer += "%" + reg + " = add i64 %" + ref1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sum_int(String value1, int ref2) {
        buffer += "%" + reg + " = add i64 " + value1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sum_int(int ref1, String value2) {
        buffer += "%" + reg + " = add i64 %" + ref1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sum_int(String value1, String value2) {
        buffer += "%" + reg + " = add i64 " + value1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }

    static int sum_double(int ref1, int ref2) {
        buffer += "%" + reg + " = fadd double %" + ref1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sum_double(String value1, int ref2) {
        buffer += "%" + reg + " = fadd double " + value1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sum_double(int ref1, String value2) {
        buffer += "%" + reg + " = fadd double %" + ref1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sum_double(String value1, String value2) {
        buffer += "%" + reg + " = fadd double " + value1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }

    static int sub_int(int ref1, int ref2) {
        buffer += "%" + reg + " = sub i64 %" + ref1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sub_int(String value1, int ref2) {
        buffer += "%" + reg + " = sub i64 " + value1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sub_int(int ref1, String value2) {
        buffer += "%" + reg + " = sub i64 %" + ref1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sub_int(String value1, String value2) {
        buffer += "%" + reg + " = sub i64 " + value1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }

    static int sub_double(int ref1, int ref2) {
        buffer += "%" + reg + " = fsub double %" + ref1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sub_double(String value1, int ref2) {
        buffer += "%" + reg + " = fsub double " + value1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sub_double(int ref1, String value2) {
        buffer += "%" + reg + " = fsub double %" + ref1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int sub_double(String value1, String value2) {
        buffer += "%" + reg + " = fsub double " + value1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }

    static int mult_int(int ref1, int ref2) {
        buffer += "%" + reg + " = mul i64 %" + ref1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int mult_int(String value1, int ref2) {
        buffer += "%" + reg + " = mul i64 " + value1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int mult_int(int ref1, String value2) {
        buffer += "%" + reg + " = mul i64 %" + ref1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int mult_int(String value1, String value2) {
        buffer += "%" + reg + " = mul i64 " + value1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }

    static int mult_double(int ref1, int ref2) {
        buffer += "%" + reg + " = fmul double %" + ref1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int mult_double(String value1, int ref2) {
        buffer += "%" + reg + " = fmul double " + value1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int mult_double(int ref1, String value2) {
        buffer += "%" + reg + " = fmul double %" + ref1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int mult_double(String value1, String value2) {
        buffer += "%" + reg + " = fmul double " + value1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }

    static int div_int(int ref1, int ref2) {
        buffer += "%" + reg + " = sdiv i64 %" + ref1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int div_int(String value1, int ref2) {
        buffer += "%" + reg + " = sdiv i64 " + value1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int div_int(int ref1, String value2) {
        buffer += "%" + reg + " = sdiv i64 %" + ref1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int div_int(String value1, String value2) {
        buffer += "%" + reg + " = sdiv i64 " + value1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }

    static int div_double(int ref1, int ref2) {
        buffer += "%" + reg + " = fdiv double %" + ref1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int div_double(String value1, int ref2) {
        buffer += "%" + reg + " = fdiv double " + value1 + ", %" + ref2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int div_double(int ref1, String value2) {
        buffer += "%" + reg + " = fdiv double %" + ref1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }
    static int div_double(String value1, String value2) {
        buffer += "%" + reg + " = fdiv double " + value1 + ", " + value2 + "\n";
        reg++;
        return  reg - 1;
    }

    //load
    static int load_int(String ident, boolean global) {
        if (global) {
            buffer += "%" + reg + " = load i64, i64* @" + ident + "\n";
        }
        else {
            buffer += "%" + reg + " = load i64, i64* %" + ident + "\n";
        }
        reg++;
        return reg - 1;
    }

    static int load_double(String ident, boolean global) {
        if (global) {
            buffer += "%" + reg + " = load double, double* @" + ident + "\n";
        }
        else {
            buffer += "%" + reg + " = load double, double* %" + ident + "\n";
        }
        reg++;
        return reg - 1;
    }

    static int load_bool(String ident, boolean global) {
        if (global) {
            buffer += "%" + reg + " = load i1, i1* @" + ident + "\n";
        }
        else {
            buffer += "%" + reg + " = load i1, i1* %" + ident + "\n";
        }
        reg++;
        return reg - 1;
    }

    //or, and, !
    static int or(int ref1, int ref2) {
        buffer += "%" + reg + " = or i1 %" + ref1 + ", %" + ref2 + "\n";
        reg++;
        return reg - 1;
    }
    static int or(String value1, int ref2) {
        buffer += "%" + reg + " = or i1 " + value1 + ", %" + ref2 + "\n";
        reg++;
        return reg - 1;
    }
    static int or(int ref1, String value2) {
        buffer += "%" + reg + " = or i1 %" + ref1 + ", " + value2 + "\n";
        reg++;
        return reg - 1;
    }
    static int or(String value1, String value2) {
        buffer += "%" + reg + " = or i1 " + value1 + ", " + value2 + "\n";
        reg++;
        return reg - 1;
    }

    static int and(int ref1, int ref2) {
        buffer += "%" + reg + " = and i1 %" + ref1 + ", %" + ref2 + "\n";
        reg++;
        return reg - 1;
    }
    static int and(String value1, int ref2) {
        buffer += "%" + reg + " = and i1 " + value1 + ", %" + ref2 + "\n";
        reg++;
        return reg - 1;
    }
    static int and(int ref1, String value2) {
        buffer += "%" + reg + " = and i1 %" + ref1 + ", " + value2 + "\n";
        reg++;
        return reg - 1;
    }
    static int and(String value1, String value2) {
        buffer += "%" + reg + " = and i1 " + value1 + ", " + value2 + "\n";
        reg++;
        return reg - 1;
    }

    static int denial(int ref) {
        buffer += "%" + reg + " = xor i1 %" + ref + ", %" + ref + "\n";
        reg++;
        return reg - 1;
    }
    static int denial(String value) {
        buffer += "%" + reg + " = xor i1 %" + value + ", %" + value + "\n";
        reg++;
        return reg - 1;
    }

    //icmp

    static int eq(int ref1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp eq i64 %" + ref1 + ", %" + ref2 + "\n";
        }
        else if (type.equals("FLOAT")){
            buffer += "%" + reg + " = icmp eq double %" + ref1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp eq i1 %" + ref1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int eq(String value1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp eq i64 " + value1 + ", %" + ref2 + "\n";
        }
        else if (type.equals("FLOAT")) {
            buffer += "%" + reg + " = icmp eq double " + value1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp eq i1 " + value1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int eq(int ref1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp eq i64 %" + ref1 + ", " + value2 + "\n";
        }
        else if (type.equals("FLOAT")) {
            buffer += "%" + reg + " = icmp eq double %" + ref1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp eq i1 %" + ref1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int eq(String value1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp eq i64 " + value1 + ", " + value2 + "\n";
        }
        else if (type.equals("FLOAT")) {
            buffer += "%" + reg + " = icmp eq double " + value1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp eq i1 " + value1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }

    static int no_eq(int ref1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp ne i64 %" + ref1 + ", %" + ref2 + "\n";
        }
        else if (type.equals("FLOAT")) {
            buffer += "%" + reg + " = icmp ne double %" + ref1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp ne i1 %" + ref1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int no_eq(String value1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp ne i64 " + value1 + ", %" + ref2 + "\n";
        }
        else if (type.equals("FLOAT")) {
            buffer += "%" + reg + " = icmp ne double " + value1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp ne i1 " + value1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int no_eq(int ref1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp ne i64 %" + ref1 + ", " + value2 + "\n";
        }
        else if (type.equals("FLOAT")) {
            buffer += "%" + reg + " = icmp ne double %" + ref1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp ne i1 %" + ref1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int no_eq(String value1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp ne i64 " + value1 + ", " + value2 + "\n";
        }
        else if (type.equals("FLOAT")) {
            buffer += "%" + reg + " = icmp ne double " + value1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp ne i1 " + value1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }

    static int more(int ref1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sgt i64 %" + ref1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sgt double %" + ref1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int more(String value1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sgt i64 " + value1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sgt double " + value1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int more(int ref1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sgt i64 %" + ref1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sgt double %" + ref1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int more(String value1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sgt i64 " + value1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sgt double " + value1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }

    static int more_eq(int ref1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sge i64 %" + ref1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sge double %" + ref1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int more_eq(String value1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sge i64 " + value1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sge double " + value1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int more_eq(int ref1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sge i64 %" + ref1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sge double %" + ref1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int more_eq(String value1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sge i64 " + value1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sge double " + value1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }

    static int less(int ref1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp slt i64 %" + ref1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp slt double %" + ref1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int less(String value1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp slt i64 " + value1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp slt double " + value1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int less(int ref1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp slt i64 %" + ref1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp slt double %" + ref1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int less(String value1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp slt i64 " + value1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp slt double " + value1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }

    static int less_eq(int ref1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sle i64 %" + ref1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sle double %" + ref1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int less_eq(String value1, int ref2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sle i64 " + value1 + ", %" + ref2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sle double " + value1 + ", %" + ref2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int less_eq(int ref1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sle i64 %" + ref1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sle double %" + ref1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }
    static int less_eq(String value1, String value2, String type) {
        if (type.equals("INTEGER")) {
            buffer += "%" + reg + " = icmp sle i64 " + value1 + ", " + value2 + "\n";
        }
        else {
            buffer += "%" + reg + " = icmp sle double " + value1 + ", " + value2 + "\n";
        }
        reg++;
        return reg - 1;
    }

    //if

    static void if_start(int ref) {
        br++;
        buffer += "br i1 %" + ref + ", label %true" + br + ", label %false" + br + "\n";
        buffer += "true" + br + ":\n";
        br_stack.push(br);
    }
    static void if_start(String value) {
        br++;
        buffer += "br i1 %" + value + ", label %true" + br + ", label %false" + br + "\n";
        buffer += "true" + br + ":\n";
        br_stack.push(br);
    }

    static void if_end() {
        int b = br_stack.pop();
        buffer += "br label %false" + b + "\n";
        buffer += "false" + b + ":\n";
    }


    //while

    static void while_start() {
        stack_pop = false;
        br++;
        buffer += "br label %while" + br + "\n";
        buffer += "while" + br + ":\n";
        br_loop.push(br);
    }

    static void while_condition(int ref) {
        buffer += "br i1 %" + ref + ", label %true" + br + ", label %false" + br + "\n";
        buffer += "true" + br + ":\n";
        br_stack.push(br);
    }

    static void while_condition(String value) {
        buffer += "br i1 " + value + ", label %true" + br + ", label %false" + br + "\n";
        buffer += "true" + br + ":\n";
        br_stack.push(br);
    }

    static void while_end() {
        int b = br_stack.pop();
        buffer += "br label %while" + b + "\n";
        buffer += "false" + b + ":\n";
        if (!stack_pop) br_loop.pop();
    }

    static void Continue() {
        int b = br_loop.pop();
        buffer += "br label %while" + b + "\n";
        br_loop.push(b);
        reg++;
    }

    static void Break() {
        int b = br_loop.pop();
        reg++;
        stack_pop = true;
        buffer += "br label %false" + b + "\n";
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
