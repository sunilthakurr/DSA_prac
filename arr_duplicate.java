package com.company;
import java.util.*;
public class arr_duplicate {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=obj.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j)
                    System.out.println("Duplicate elements are :"+arr[i]);
            }
        }

    }
}
