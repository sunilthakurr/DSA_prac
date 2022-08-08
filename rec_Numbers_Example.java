// WAP TO PRINT FIRST 5 NATURAL NUMBERS i.e ; 1,2,3,4,5

package com.company;
public class rec_Numbers_Example{

    public static void main(String[] args) {
        funrev(5);

    }
    static void funrev(int n){
        if(n==0)
            return;
        funrev(n-1);
        System.out.println(n);
    }
}
