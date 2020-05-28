import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class OptimizationLLVM {
    static ArrayList<String> list = new ArrayList<>();
    static String current_function  = "";
    static HashMap<String, HashMap<String, Variable>> variables = new HashMap<>();

    static class Variable {
        public String function;
        public String id;
        public String initialization;
        public ArrayList<String> store = new ArrayList<>();

        public Variable(String function, String id, String initialization) {
            this.function = function;
            this.id = id;
            this.initialization = initialization;
        }

        public void addStore(String stores) {
            this.store.add(stores);
        }

        public ArrayList<String> getStore() {
            return this.store;
        }
    }

    static void optimization() {
        try {
            File file = new File("/home/iliy/llvm/hello.ll");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line_ = reader.readLine();
            while (line_ != null) {
                if (!line_.equals("")) list.add(line_);
                line_ = reader.readLine();
            }
            HashMap<String, Variable> global_var = new HashMap<>();
            HashMap<String, Variable> current_var = new HashMap<>();
            ArrayList<String> set_var = new ArrayList<>();
            for (String line : list) {

                if (line.contains("define")) {
                    current_function = line.substring(line.indexOf("@") + 1, line.indexOf("("));
                    current_var = new HashMap<>();
                }
                else if (line.contains("ret")) {
                    ArrayList<String> del = new ArrayList<>();
                    for (String l : set_var) {
                        if (l.contains("%")) {
                            del.add(l);
                        }
                    }
                    HashMap<String, Variable> tt = new HashMap<>();
                    for (String l : del) {
                        tt.put(l, current_var.get(l));
                        set_var.remove(l);
                    }
                    variables.put(current_function, tt);
                    current_function = "";
                }
                else if (line.contains("global") || (line.contains("constant"))) {
                    String var = line.substring(line.indexOf("@"), line.indexOf("=") - 1);
                    global_var.put(var, new Variable("global", var, line));
                    set_var.add(var);
                }
                else if (line.contains("alloca")) {
                    String var = line.substring(line.indexOf("%"), line.indexOf("=") - 1);
                    current_var.put(var, new Variable(current_function, var, line));
                    set_var.add(var);
                }
                else if (line.contains("store")) {
                    String var = line.substring(line.indexOf("* ") + 2);
                    String var_t = line.substring(line.indexOf("* ") + 2, line.length() - 1);
                    if (var_t.equals("%")) {
                        Variable variable = current_var.get(var);
                        variable.addStore(line);
                        current_var.replace(var, variable);
                    }
                    else {
                        Variable variable = global_var.get(var);;
                        variable.addStore(line);
                        global_var.replace(var, variable);
                    }
                }
                else {
                    ArrayList<String> del = new ArrayList<>();
                    for (String var : set_var) {
                        if ((line.contains(var)) && (!line.contains("%false") && (!line.contains("%true") && (!line.contains("%while"))))) {
                            del.add(var);
                        }
                    }
                    for (String var : del) {
                        set_var.remove(var);
                    }
                }

            }
            variables.remove("main");
            HashMap<String, Variable> tt = new HashMap<>();
            for (String var : set_var) {
                tt.put(var, global_var.get(var));
            }
            variables.put("global", tt);


            for (Map.Entry<String, HashMap<String, Variable>> c : variables.entrySet()) {
                String func = c.getKey();
                HashMap<String, Variable> w = c.getValue();
                System.out.println("Function " + func + " - deleted variable:");
                if (func.equals("global")) {
                    for (Map.Entry <String, Variable> var : w.entrySet()) {
                        System.out.println(var.getKey());
                        ArrayList<String> str = var.getValue().getStore();
                        for (String line : str) {
                            list.remove(line);
                        }
                        list.remove(var.getValue().initialization);
                    }
                }
                else {
                    ArrayList<String> before = new ArrayList<>();
                    ArrayList<String> cur_fun = new ArrayList<>();
                    ArrayList<String> after = new ArrayList<>();
                    int state = 0;
                    boolean write = false;
                    for (String line : list) {
                        if (line.contains("define")) {
                           if (func.equals(line.substring(line.indexOf("@") + 1, line.indexOf("(")))) {
                               cur_fun.add(line);
                               write = true;
                           }
                           else if (state == 0) {
                               before.add(line);
                           }
                           else after.add(line);
                        }
                        else if (line.contains("ret")) {
                            if (write) {
                                cur_fun.add(line);
                                state = 1;
                            }
                            else if (state == 0) {
                                before.add(line);
                            }
                            else {
                                after.add(line);
                            }
                            write = false;
                        }
                        else if (write) {
                               cur_fun.add(line);
                           }
                        else if (state == 0) {
                            before.add(line);
                        }
                        else if (state == 1) {
                            after.add(line);
                        }
                        }
                        for (Map.Entry <String, Variable> var : w.entrySet()) {
                            System.out.println(var.getKey());
                            ArrayList<String> str = var.getValue().getStore();
                            for (String line : str) {
                                cur_fun.remove(line);
                            }
                            cur_fun.remove(var.getValue().initialization);
                        }
                        list.clear();
                        for (String line : before) list.add(line);
                        for (String line : cur_fun) list.add(line);
                        for (String line : after) list.add(line);
                    }

                }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try(FileWriter writer = new FileWriter("/home/iliy/llvm/hello.ll", false)) {
            String text = "";
            for (String line : list) text += line + "\n";
            writer.write(text);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
