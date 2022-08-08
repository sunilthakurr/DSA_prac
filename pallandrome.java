package com.company.Recursion;

import java.util.Scanner;

public class pallandrome {
    static int ans;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = obj.nextInt();
        int t=N;
        System.out.println(rev(N));
        System.out.println(ispallandrome(N));


    }

    static int rev(int n) {
        if (n == 0)
            return ans;
        int rem = n % 10;
        ans = ans * 10 + rem;
        rev(n / 10);
        return ans;

    }

    static boolean ispallandrome(int n) {
        return (n == rev(n));
    }
}
