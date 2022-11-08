package com.gb.spring;


import lombok.Getter;

public class Product {
    private static long id_sequence = 1L;
    @Getter
    private final long id;
    private final String productName;
    private final int price;

    public Product(String productName, int price) {
        this.id = id_sequence++;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
