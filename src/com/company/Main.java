package com.company;


public class Main {
    public static void main(String[] args) {
        Animal bear = new Animal();
        bear.country = ("Russia");
        bear.name = ("Bill");
        bear.age = 5;
        bear.start();
        bear.babies(3);
        bear.behavior2();


        Animal crocodile = new Animal();

        crocodile.country = ("Bras  il");
        crocodile.name = ("Carl");
        crocodile.age = 8;
        crocodile.start();
        crocodile.behavior1();

        Animal tiger = new Animal();
        tiger.name = ("Sarah");
        tiger.babies(3);
        tiger.setDish("Meeeeeaaaaaaaat");
        tiger.eat();



    }

}
