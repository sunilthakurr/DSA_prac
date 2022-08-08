package com.company.Recursion;

import java.util.Scanner;

public class rope_cutting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        System.out.println(max_cut(n, a, b, c));
    }
    static int max_cut(int n, int a, int b, int c){
        if(n==0)
            return 0;
        if(n < 0)
            return -1;
        int res = max_ele(max_cut(n-a, a, b, c),max_cut(n-b, a, b, c),max_cut(n-c, a, b, c));
        if(res == -1)
        return -1;
        return res+1;
    }
    static int max_ele(int a,int b, int c){
        if(a > b && a > c)
            return a;
        else if(b > c)
            return b;
        return c;
    }

}
