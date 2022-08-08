package com.company.Recursion;

public class remove_string {
    public static void main(String[] args) {
        String st = "abappleacusdogapple";
        String skip = "apple";
        System.out.println(string_skip(st, skip));
    }
    static String string_skip(String st, String skip){
        if(st.length() == 0)
            return "";
        if(st.startsWith(skip))
            return string_skip(st.substring(5), skip);
        return st.charAt(0) + string_skip(st.substring(1),skip);
    }
}
