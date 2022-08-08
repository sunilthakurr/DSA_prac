package com.company.Recursion;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int []arr = {4,3,2,1,0};
        int size = arr.length -1;
        bubble(arr,size , 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[]arr,int size , int index){
        if(size == 0)
            return;
        if(index < size) {
            if (arr[index] > arr[index + 1]) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;

            }
            bubble(arr, size, ++index);

        }
        else{
            bubble(arr , --size , 0);
        }

    }

}
