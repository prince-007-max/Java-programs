package com.prince;

import java.util.Scanner;

public class NoColArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
            System.out.println();
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
            System.out.println();
        }

    }
}
