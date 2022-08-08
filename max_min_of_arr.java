package com.company;
import java.util.*;
public class max_min_of_arr {
    static int max=0,min=0;
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=obj.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
            max=arr[0];
             min=arr[0];
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Maximum element in Array is : "+max);
        System.out.println("Minimum element in Array is : "+min);
    }
}
