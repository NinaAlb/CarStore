package com.atqc;

public class Amphibious extends Car implements Swim {

    Amphibious(String price) {
        super(price);
    }

    public String swim() {
        return "I can swim!";
    }

    public void engineSound() {
        System.out.println("Fizz-fizz");
    }
}
