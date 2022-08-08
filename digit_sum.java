package com.company.Recursion;

import java.util.Scanner;

public class digit_sum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(digit_sum(num));
    }
    static int digit_sum(int num){
        if(num == 0)
            return 0;
        return num%10 + digit_sum(num/10);
    }
}
