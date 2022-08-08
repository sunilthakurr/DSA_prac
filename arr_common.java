package com.company;
import java.util.*;
public class arr_common {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the size of 1st Array");
        int size1=obj.nextInt();

        String[]arr1=new String[size1];

        System.out.println("Enter the elements of 1st array");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=obj.nextLine();
        }
        System.out.println("Enter the size of 2nd Array");
        int size2=obj.nextInt();
        String[]arr2=new String[size2];
        System.out.println("Enter the elements of 2nd Array");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=obj.nextLine();
        }
        for(int i=0;i<arr1.length-1;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr1[i].equals(arr2[j]) && i!=j)
                    System.out.println("Duplicate elements :"+arr1[i]);
            }
        }
    }
}
