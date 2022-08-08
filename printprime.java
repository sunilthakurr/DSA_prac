package com.company;

public class printprime {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            for(int j=2;j<=i/2 +1;j++){
                if(i%j==0)
                    System.out.println("prime numbers are :"+i);
            }
        }
    }
}
