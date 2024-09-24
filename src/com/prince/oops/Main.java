package com.prince.oops;

public class Main {

    public static void main(String[] args) {

        Human prince = new Human(19,"john",12000,false);
        System.out.println(prince.name);
        System.out.println(Human.population);
    }
}
