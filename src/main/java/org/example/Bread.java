package org.example;
public class Bread extends Product {
    private final String name = "Хлеб";
    private final int price = 100;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }


}
