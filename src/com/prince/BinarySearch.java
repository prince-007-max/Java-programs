package com.prince;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,23,45,66,78,89,99,100};
        int target = 99;
        int ans = Bg(arr, target, 0, arr.length - 1);
        System.out.println(ans);



    }

    static int Bg(int[] arr,int target,int start,int end){

        if(start > end){
            return -1;

        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target ){
            return mid;

        } else if (arr[mid] < target) {
            return Bg(arr,target, mid+1, end);
        }else{
            return Bg(arr, target, start, mid-1);
        }


    }

}
