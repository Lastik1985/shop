package org.example;
public class Phone extends Product {
    private final String name = "Телефон";
    private final int price = 1000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

}


