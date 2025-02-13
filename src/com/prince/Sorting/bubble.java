package com.prince.Sorting;

import java.util.*;

public class bubble {
    public static void main(String[] args) {
        
        int num[] ={9,7,5,6,8,2,3,1};
        int size = num.length;

        for (int ans : num) {
            System.out.print(ans + " ");
        }

        for(int i=0;i<size;i++){

            for (int j = 0; j < size-1-i ; j++) {
                if(num[j] > num[j + 1]){
                    int temp = num[j];;
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
                
                
            }

            System.out.println();
            for (int an : num) {
                System.out.print(an + " ");
            }

        }



    }
}
