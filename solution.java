package com.company;

//import java.io.*;
import java.util.*;

public class solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        for(int j = 0; j < size; j++){
            String st = obj.nextLine();
            if(is_valid(st))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
    static boolean is_valid(String st){
        if(!((st.charAt(0) >='a' && st.charAt(0) <= 'z') ||
                (st.charAt(0) >='A' && st.charAt(0) <= 'Z' )))
            return false;
        for(int i = 1; i < st.length(); i++){
            if(!((st.charAt(i) >='a' && st.charAt(i) <= 'z' || st.charAt(i) >='A' && st.charAt(i) <= 'Z' || st.charAt(i) >= '0' && st.charAt(i) <='9')))
                return false;

        }
        return true;
    }
}