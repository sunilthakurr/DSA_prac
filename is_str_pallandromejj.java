package com.company.Recursion;

import java.util.Scanner;
import java.lang.String;

public class is_str_pallandromejj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(ispallandrome(st, 0, st.length() - 1));
    }
    static boolean ispallandrome(String st, int start, int end){
        if(start >= end)
            return true;
        return (st.charAt(start) == st.charAt(end) && ispallandrome(st, start + 1, end - 1));
    }
}
