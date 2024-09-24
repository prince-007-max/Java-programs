package com.prince.oops;

public class Main {

    public static void main(String[] args) {

        Human prince = new Human(19,"john",12000,false);
        System.out.println(prince.name);
        System.out.println(Human.population);

        Constuctor size = new Constuctor();
        Constuctor size1 = new Constuctor(12,14);
        Constuctor size2 = new Constuctor(size);

        System.out.println(size1.h);

        System.out.println(size2.w);
    }
}
