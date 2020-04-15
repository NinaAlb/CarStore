package com.atqc;

public abstract class Car {

    private String price;
    private Color color;
    static int soldCarCount = 0;

    Car(String price) {
        setPrice(price);
    }

    String getPrice() {
        return price;
    }

    void setPrice(String price) {
        this.price = price;
    }

    void setColor(Color color) {
        this.color = color;
    }

    public abstract void engineSound();

    void openDoors() {
        System.out.println("The doors are opened!");
    }

    void sell(String price) {
        try {
            System.out.println("You can sell this car for " + price);
            soldCarCount++;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry, customer is out of money!");
        }

    }

    public void go(boolean isBroken) throws CarIsBrokenException {
        if (isBroken) {
            throw new CarIsBrokenException("Your car is broken and can't go!");
        }
        System.out.println("GO!");
    }

}
