package com.prince.Sorting;

import java.util.*;

public class Selection {
    int num[] ={9,7,5,6,8,2,3,1};
    int size = num.length;

    for (int ans : num) {
        System.out.println(ans + " ");
    }

    for(int i = 0; i < size; i++){

        int min = i;
        for(int j = i+1; j<size; j++ ){
            if(num[min] > num[j]){
                min = j;
            }
        }

        int temp = num[min];
        num[min] = num[j];
        num[j] = temp;

    }

}
