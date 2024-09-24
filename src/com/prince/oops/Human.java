package com.prince.oops;


public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;



    Human(int age, String name, int Salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = Salary;
        this.married= married;
        Human.population += 1;

    }

}
