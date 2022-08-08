package com.company;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        isarmstrong(n);

    }
    public static void isarmstrong(int n){
        int num = n;
        int newnum = 0;
        int rem = 0;
        int nn = n;
        int count = 0;

        while(n!=0) {
            count += 1;
            n /= 10;
        }

//        int leng= n.toString();
//        int lem = leng.length();
//        System.out.println(lem);

        while(num != 0){
            rem = num%10;
            newnum += Math.pow(rem,count);
            num /= 10;
        }

        if(nn == newnum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
