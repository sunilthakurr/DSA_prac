package com.company;
import java.util.*;
public class arr_copy {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=obj.nextInt();
        int[]arr=new int[size];
        int[]arr2=new int[size];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
            arr2[i]=arr[i];

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
