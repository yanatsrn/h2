package com.company;

public class Animal {

    String name;
    String country;
    int age;
    private String dish;


    void start() {
        System.out.printf("%s is from %s . It is %d years old\n",name, country, age);
    }
    void babies(int baby ){
        System.out.println(name + " has "+ baby + " babies\n");
    }
    void behavior1(){
        System.out.println(name + " likes lying on the branch.");
    }
    void behavior2(){
        System.out.println(name + " likes sleeping under the tree.\n");
    }

    public void setDish(String beeeeeeaaf) {
        this.dish = beeeeeeaaf;
    }

    public String getDish() {
        return dish;
    }

    void eat()  {
        System.out.println("Favourite dish is " + dish);
    }


}
