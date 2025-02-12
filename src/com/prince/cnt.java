package com.prince;
import java.util.*;
public class cnt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0, div=1;
        while(div<n){
            div*=10
        }
        while(div>0){
            sum+=(n/div)%10;
            div/=10;

        }
        System.out.println(sum);
        System.out.println(n);
    }
    
}
