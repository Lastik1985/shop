package org.example;

import java.util.Scanner;

public class Main {
   public static final char RUB = (char) 0x20BD;

    public static void main(String[] args) {

        Product[] products = {new Car(),new Phone(), new Apple(), new Bread(), new Milk()};
        printProducts(products);
        Scanner scanner = new Scanner(System.in);
        while (true) {
                System.out.println("Введите номер товара и количество или введите `end` ");
                String input = scanner.nextLine();
                if ("end".equals(input)) break;
                String[] parts = input.split(" ");
                int productNumber = Integer.parseInt(parts[0]) - 1;
                products[productNumber].setCount(Integer.parseInt(parts[1]));
            }

        printBasket(products);
    }

    private static void printProducts(Product[] products) {
        for (Product product : products) {
        System.out.println(product + " Стоимость " + product.getPrice() + " " + RUB);
        }
    }

    private static void printBasket(Product[] products) {
        int costProducts = 0;
        System.out.println("Ваша корзина: ");
        for (Product product : products) {
            if (product.getCount() != 0) {
                costProducts += product.getCount() * product.getPrice();
                System.out.println(product + " Количество = " + product.getCount() + " шт."
                        + " Цена = " + product.getPrice() + " " + RUB
                        + " Стоимость = " + product.getCount() * product.getPrice() + " " + RUB);
            }
        }
        System.out.println("Итого: " + costProducts + " " + RUB);
    }
}