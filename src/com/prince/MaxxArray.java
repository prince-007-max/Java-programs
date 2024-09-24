package com.prince;

import java.util.Arrays;

public class MaxxArray {
    public static void main(String[] args) {
        int[] arr = {12,45,68,45,6,7};
        System.out.println(max(arr));
    }

    static int max (int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if(max < arr[i]){
                max = arr[i];

            }

        }
        return max;

    }
}
