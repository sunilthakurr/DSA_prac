package com.company.Recursion;


import java.util.*;

public class subset_of_string {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String st = obj.next();
        String emp = "";
        subset(st, emp, 0);

    }
    static void subset(String st,String emp, int i){
        if(i == st.length()) {
            System.out.println(emp);
            return ;
        }
        subset(st, emp,i+1);
        subset(st,emp+st.charAt(i),i+1);
    }
}
