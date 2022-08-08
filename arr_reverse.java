package com.company;

import java.util.*;

public class arr_reverse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=obj.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Original Array is "+Arrays.toString(arr));
//        System.out.println("Array in reverse is ");
       for(int i=0;i<arr.length/2;i++){
           int temp=arr[i];
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;
    }
        System.out.println("Arrays in reverse order is "+Arrays.toString(arr));
    }
}
