package com.prince.oops;

public class Box extends Constuctor{
    double weight;

    public Box (double a, double b, double c, double w){
        this.h = a;
        this.l = b;
        this.w = c;
        this.weight = w;

    }

    Box (double a, double b, double weight){
        this.h = a;
        this.l = b;
    }


    Box (Box other){
        super(other);
        this.weight = other.weight;
    }
}
