package com.atqc;

import static com.atqc.Color.RED;

public class App {

    public static void main( String[] args ) {

        Car maserati = new Maserati("500000$", "GranCabrio");
        maserati.openDoors();
        maserati.setColor(RED);
        maserati.sell(maserati.getPrice());

        new DeLorean("Too much").openDoors();

        Amphibious amphibious = new Amphibious("500k");
        amphibious.setPrice("1000k");
        amphibious.sell(amphibious.getPrice());
        amphibious.swim();

        System.out.println(Car.soldCarCount);

    }

}
