package com.atqc;

public class DeLorean extends Car implements Fly {

    DeLorean(String price) {
        super(price);
    }

    public void engineSound() {
        System.out.println("Jjjjjj");
    }

    @Override
    public void openDoors() {
        System.out.println("I can open the door! And it's amazing");
    }

    public void fly() {
        System.out.println("I'm flying!");
    }
}
