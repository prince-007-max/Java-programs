package com.prince;

public class Fibo {
    public static void main(String[] args) {
//        int ans = fibo(8);
        System.out.println(no(8));

    }

    static int no(int n){

        if(n < 2){
            return n;
        }

        return no(n-1) + no(n-2);
    }
}