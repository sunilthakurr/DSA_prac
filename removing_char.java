
             //    skip a given character from the string

package com.company.Recursion;

public class removing_char {
    public static void main(String[] args) {
        String st = "abacus";
        char X = 'a';
        System.out.println(removed(st, X));

    }

    static String removed(String st, char X) {
        if (st.length() == 0)
            return "";
        if (st.charAt(0) == X)
            return removed(st.substring(1), X);
        return st.charAt(0) + removed(st.substring(1), X);
    }
}
