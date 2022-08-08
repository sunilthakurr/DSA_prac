package com.company.Recursion;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int N=obj.nextInt();
        System.out.println("Sum of digit of "+N+" is "+sum(N));

    }
    static int sum(int n){
        if(n == 0)
            return 0;
        return ((n % 10) + sum(n /10));
    }
}
