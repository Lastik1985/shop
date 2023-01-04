package org.example;
public class Milk extends Product {
    private final String name = "Молоко";
    private final int price = 300;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }


}
