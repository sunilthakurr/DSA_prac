package com.company;
import java.util.*;
public class codechef_mean {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for (int i = 0; i < T; i++) {
            int size = obj.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = obj.nextInt();
            }
            int queries = obj.nextInt();
            int L = 0, R = 0, X = 0;
            for (int j = 0; j < queries; j++) {
                L = obj.nextInt();
                R = obj.nextInt();
                X = obj.nextInt();
            }
            int count = 0;
            for (int k = L; k <R + 1;k++){
                if ((arr[k] ^ X) >( arr[k] & X))
                    count++;
            }
            System.out.println(count);
        }
    }
}