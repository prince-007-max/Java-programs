package com.prince;

import java.util.Scanner;

public class StringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int n = name.length();
        int st= n;

        for (int i = 1; i <= n; i++) {
            for(int j = 0; j < st;j++){
                System.out.print(name.charAt(j) + " ");
            }
            st--;
            System.out.println();
        }
    }
}
