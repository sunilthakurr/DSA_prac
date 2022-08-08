package com.company;
import java.util.*;
public class arr_dup_string {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=obj.nextInt();
        String []arr=new String[size];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextLine();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j] )&& i!=j)
                    System.out.println("Duplicate element : "+arr[i]);
            }
        }
    }
}
