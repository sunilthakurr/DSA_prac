package com.company;

import java.util.*;

public class is_anagram {
    public static void main(String[] args) {
        int count=0;
        Scanner obj=new Scanner(System.in);
        String st1=obj.nextLine();
        String st2=obj.nextLine();
        st1.toLowerCase();
        System.out.println(st1);
        st2.toLowerCase();
        System.out.println(st2);
        char[]str1=st1.toCharArray();
        char[]str2=st2.toCharArray();
        if(st1.length() != st2.length())
            System.out.println("NOT ANAGRAM");
        else{
            Arrays.sort(str1);
            Arrays.sort(str2);
            for(int i=0;i<st1.length();i++){
                if(str1[i] != str2[i])
                    count++;
            }
            if(count==0)
                System.out.println("ANAGRAM");
            else
                System.out.println("NOT ANAGRAM");
        }
    }
}
