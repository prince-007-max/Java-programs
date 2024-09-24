package com.prince;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(amstrong(n));


    }


    static boolean amstrong(int n){
        int org =n;
        int sum = 0;

        while (n > 0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }

        return sum == org;

    }
}