package com.company.Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int N=obj.nextInt();
        System.out.println("Factorial of "+N+" is "+fact(N));
    }
    static int fact(int n){
        if(n<=1)
            return 1;
        return n * fact(n-1);
    }
}
