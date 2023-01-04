package org.example;

public class Car extends Product {
    private final String name = "Авто";
    private final int price = 5000;
    @Override
    public String toString() {
        return name;
    }

   @Override
    public int getPrice() {
        return price;
    }


}
