package com.prince;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];

//        for (int i = 0; i < 10; i++) {
//            System.out.print("index-"+i+"=");
//            arr[i]=sc.nextInt();
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.print(arr[i]);
//
//        }

//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = sc.nextLine();
//
//
//        }
//        for (int i = 0; i < str.length; i++) {
//            System.out.print(str[i]);
//        }

//        int[] n = {1,2,3,4,5};
//        System.out.println(Arrays.toString(n));
//        change(n);
//        System.out.println(Arrays.toString(n));
          int[][] arr = new int[2][2];
        //it is row of matexis
        for (int row = 0; row < 2; row++) {
            //it is column
            for (int col = 0; col < 2; col++) {
                arr[row][col] = sc.nextInt();
            }

        }

        for (int row = 0; row < 2; row++) {
            //it is column
            for (int col = 0; col < 2; col++) {
                System.out.println(arr[row][col]);
            }

        }

    }

    static void change(int[] arr){
        arr[3]=10;
    }
}
