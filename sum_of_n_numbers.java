package com.company.Recursion;

import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int N=obj.nextInt();
        System.out.println("sum of first "+N+" number is "+sum(N));
    }
    static int sum(int n){
        if(n <= 1)
            return 1;
        return n+sum(n-1);
    }
}
