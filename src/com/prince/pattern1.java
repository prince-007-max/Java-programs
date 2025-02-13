package com.prince;
import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n - 1, st = 1;

        for(int i = 1 ; i <= n*2-1; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print("  ");
            }

            for(int k = 1; k <= st; k++){
                System.out.print("* ");
            }
            if(i < n){
                sp--;
                st+=2;
            }else{
                st -= 2;
                sp++;
            }
            
            System.out.println();
        }
        


    }
}
