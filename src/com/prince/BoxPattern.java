package com.prince;

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st=n;
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=st; j++){
                if(i==1 || j==1 || j==n || i==n || j == i || i+j == n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
