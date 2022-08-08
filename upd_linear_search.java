package com.company.Recursion;

import java.util.ArrayList;

public class upd_linear_search {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,3,4,6};
        int target = 4;
        ArrayList<Integer>list = new ArrayList<>(10);
        System.out.println(uls(arr,0,target,list));
    }
//  static  ArrayList<Integer>list = new ArrayList<>(10);
    static ArrayList uls(int[] arr,int index, int target, ArrayList<Integer> list){
        if(index == arr.length)
            return list;
        if(arr[index] == target)
            list.add(index);
        return uls(arr,index + 1, target, list);

    }
}
