package com.prince.oops;


class laptop{
    public void code(){
        System.out.println("The code is running by laptop");
    }
}

class desktop{
    public void code(){
        System.out.println("The code is running by desktop");
    }
}

class developer{
    public void developer(laptop lab){
        lab.code();
    }
}



public class absrat1 {

    public static void main(String[] args) {
        laptop lap = new laptop();

        desktop des = new desktop();
        developer dev = new developer();

        dev.developer(lap);
        


    }
}