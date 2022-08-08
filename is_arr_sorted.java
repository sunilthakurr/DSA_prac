package com.company.Recursion;

import java.util.Scanner;

public class is_arr_sorted {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4,5,6,9,8};
        System.out.println(is_sorted(arr1 , 0));
    }
    static boolean is_sorted(int[]arr,int index){
        //base condition
        if(index == arr.length-1)
            return true;
        return arr[index]<arr[index + 1] && is_sorted(arr,index +1);
    }

}
