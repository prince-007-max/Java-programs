package com.prince.oops;

public class Main {

    public static void main(String[] args) {

        Human prince = new Human(19,"john",12000,false);
        System.out.println(prince.name);
        System.out.println(Human.population);

        Constuctor size1 = new Constuctor(12,14);


        System.out.println(size1.h);

        Box size = new Box(12,15,20,40);
        size.information();

    }
}
