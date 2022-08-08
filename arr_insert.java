package com.company;
import java.util.*;
public class arr_insert {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=obj.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter the index at which you want to add elements");
        int index=obj.nextInt();
        System.out.println("Enter the value you want to add");
        int value=obj.nextInt();
        for(int i=arr.length-1;i>index;i--) arr[i] = arr[i - 1];
        arr[index]=value;
        System.out.println("Array after update is :"+Arrays.toString(arr));
    }

}
