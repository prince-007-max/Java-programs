package com.prince;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 13, 14, 15},
                {16, 17, 18, 19},
                {20, 21, 23, 25}
        };

        System.out.println(Arrays.toString(search(arr, 12)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;

            } else {
                col--;
            }

        }
        return new int[0];
    }

}
