package com.company.Recursion;

import java.util.Scanner;

public class product_of_digit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = obj.nextInt();
        System.out.println("Product of digit of "+N+" is "+product(N));
    }
    static int product(int n){
        if(n % 10 == n)
            return n;
        return (n % 10) * product(n / 10);
    }
}
