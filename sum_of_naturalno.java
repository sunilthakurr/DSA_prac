package com.company.Recursion;
import java.util.*;
public class sum_of_naturalno {
    public static void main(String[] args) {


        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(sum(num,1));

    }
    static int sum(int n,int k){
        if(k==n)
            return n;
        return k+sum(n,k+1);
    }
}