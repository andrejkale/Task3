package com.company;

public class Main {

    public static void main(String[] args) {
        Car volvo = new Car(243000, "Volvo", "red", "sedan");
        Car bmw = new Car(543000, "bmw", "black", "sedan");
        Car zaz = new Car(143000, "zaz", "green", "hatchback");
        Car empty = new Car(0, "", "", "");
        Car car = new Car();
        Car car1 = new Car();
        Motorbike suzuki = new Motorbike(560000, "Suzuki", "black", "sportbike");
        Motorbike honda = new Motorbike(660000, "Honda", "red", "sportbike");
        Motorbike ktm = new Motorbike(860000, "KTM", "red black", "crossbike");
        Motorbike motorbike = new Motorbike();
        Motorbike motorbike1 = new Motorbike();

        Car.avgCost();
        Motorbike.avgCost();
        System.out.println("Car count = " + Car.getCount());
        System.out.println();
        System.out.println("Motorbike count = " + Motorbike.getCount());
        System.out.println();


        Container allgood = new Container();
        allgood.add(bmw);
        allgood.add(zaz);
        allgood.add(volvo);
        allgood.add(empty);
        allgood.add(car);
        allgood.add(car1);
        allgood.add(suzuki);
        allgood.add(honda);
        allgood.add(ktm);
        allgood.add(motorbike);
        allgood.add(motorbike1);
        allgood.print();
        System.out.println("________________");
        allgood.sortCost();
        allgood.print();
        System.out.println("Goods count = " + allgood.count());


    }
}
