package com.company;

/**
 * Created by User on 7/10/2017.
 */
public abstract  class Goods implements Comparable<Goods> {
   private double cost;
   private String name;

    Goods() {
    }

    Goods(double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Goods o){
        if(this.cost < o.getCost())
            return -1;
        else if(this.cost == o.getCost())
            return 0;
        else return 1;
    }


}
