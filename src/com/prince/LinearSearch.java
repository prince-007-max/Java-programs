package com.prince;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {12,38,56,78,9,5,34};
        int target = 34;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr,int target) {
        if (arr.length <= 0) {
            return -1;
        }
        //int element = target;
        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]) {
                return index;

            }

        }
        return  -1;

    }
}
