package com.prince.oops;

public class Constuctor {
    double l;
    double h;
    double w;


    Constuctor () {
        this.h = 0;
        this.l = 0;
        this.w = 10;

    }

    Constuctor (double a, double b){
        this.h = a;
        this.l = b;
    }

    Constuctor (Constuctor old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;

    }
    Constuctor (double a, double b , double c){
        this.h = a;
        this.l = b;
        this.w = c;
    }

    public void information(){
        System.out.println("The size is "+h*l*w);
    }


}
