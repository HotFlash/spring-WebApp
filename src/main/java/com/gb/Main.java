package com.gb;

import com.gb.spring.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.gb.spring");

        context.getBean(ProductRepository.class).GetProductsList();
        System.out.println(context.getBean(ProductRepository.class).GetProductByID(1).toString());
        System.out.println(context.getBean(ProductRepository.class).GetProductByID(3).toString());

        Cart cart1 = context.getBean(Cart.class);
        Cart cart2 = context.getBean(Cart.class);
        Cart cart3 = context.getBean(Cart.class);
        Cart cart4 = context.getBean(Cart.class);

        cart1.AddProduct(context.getBean(ProductRepository.class).GetProductByID(1));
        cart1.AddProduct(context.getBean(ProductRepository.class).GetProductByID(4));
        cart2.AddProduct(context.getBean(ProductRepository.class).GetProductByID(1));
        cart3.AddProduct(context.getBean(ProductRepository.class).GetProductByID(3));
        cart4.AddProduct(context.getBean(ProductRepository.class).GetProductByID(0));
        cart3.AddProduct(context.getBean(ProductRepository.class).GetProductByID(2));
        cart4.AddProduct(context.getBean(ProductRepository.class).GetProductByID(1));

        System.out.println("Card ID: " + cart1.getId() + " " + cart1.getProducts().toString());
        System.out.println("Card ID: " + cart2.getId() + " " + cart2.getProducts().toString());
        System.out.println("Card ID: " + cart3.getId() + " " + cart3.getProducts().toString());
        System.out.println("Card ID: " + cart4.getId() + " " + cart4.getProducts().toString());

        cart1.RemoveProduct(5);

        System.out.println("Card ID: " + cart1.getId() + " " + cart1.getProducts().toString());
    }
}