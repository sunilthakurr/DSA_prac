package com.company;

import java.util.Scanner;

public class trialofstr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String st = obj.next();
        for(int  i = 0; i< st.length(); i++){
            if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' ||st.charAt(i)=='u')
                System.out.println(st.charAt(i));
        }
    }
}
