package com.company.Recursion;
import java.util.*;

public class sum_of_natural_num {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(sum(num));

    }
    static int sum(int num){
        if(num == 1 )
            return 1;
        return num + sum(num - 1);
    }
}
