//       *****
//       ****
//       ***
//       **
//       *

package com.company.Recursion;

import java.util.Scanner;

public class Triangle_pattern1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        revtriangl(row , 0);


    }
    static void revtriangl(int row , int col){
        if(row == 0)
            return;
        if(col < row){
            System.out.print("*");
            revtriangl(row , ++col);
        }
        else{
            System.out.println();
            revtriangl(--row , 0);
        }
    }

        }


