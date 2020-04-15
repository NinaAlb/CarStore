package com.atqc;

public class Maserati extends Car {

    private String model;

    Maserati(String price, String model) {
        super(price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void engineSound() {
        System.out.println("Vroom-vroom!");
    }

}
