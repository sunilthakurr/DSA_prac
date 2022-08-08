package com.company.Recursion;

import java.util.Scanner;

public class Tower_of_Hanoi {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        char A ='A';
        char B = 'B';
        char C = 'C';
        TOH(n,A,B,C);
    }
    static void TOH(int n, char A, char B, char C){
        if(n ==1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        TOH(n-1,A, C, B);
        System.out.println("Move " +n +" from "+A+" to "+C);
        TOH(n-1, B, A, C);

    }
}
