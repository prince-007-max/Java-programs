package com.prince;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int index = 0; index < 10; index++) {
            arr[index] = sc.nextInt();
        }

        int ans = removeDuplicates(arr);
        System.out.println(ans);

    }

    static int removeDuplicates(int[] nums) {
        if (nums.length <= 1){
            return nums.length;
        }

        int index = 1;

        for(int i = 1; i< nums.length; i++){
            if(nums[index - 1] != nums[i] ){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
