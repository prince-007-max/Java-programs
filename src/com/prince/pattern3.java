package com.prince;

import java.util.Scanner;

public class pattern3 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n - 1, st = 1;

        for(int i = 1 ; i <= n; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= st; k++){
                System.out.print("* ");
            }

            sp--;
            st++;
            System.out.println();
        }
        


    }
}
