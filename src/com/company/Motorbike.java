package com.company;

/**
 * Created by User on 7/10/2017.
 */
public class Motorbike extends Goods {
    private String color;
    private String type;
    private static int count = 0;
    private static double commonCost = 0;

     Motorbike() {
        count++;
    }

     Motorbike(double cost, String name, String color, String type) {
        super(cost, name);
        this.color = color;
        this.type = type;
        count++;
        commonCost += cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }

    static  void avgCost(){
        System.out.println("Avg cost motorbike = " + commonCost/count);
    }
}
