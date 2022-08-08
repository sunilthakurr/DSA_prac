package com.company.Recursion;

import java.util.Scanner;

public class reverse_of_number {
    static int ans=0;
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = obj.nextInt();
        System.out.println(N+" in reverse is "+rev(N));

    }
    static int rev(int n){
        if(n == 0)
            return ans;
        int rem = n % 10;
        ans = ans * 10 + rem;
        rev(n/10);
    return ans;}
}
