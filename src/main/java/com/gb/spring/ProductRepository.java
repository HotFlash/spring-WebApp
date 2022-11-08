package com.gb.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    public ProductRepository(List<Product> products) {
        this.products = products;
    }

    public Product GetProductByID(int id) {
        return products.get(id);
    }

    public void GetListProducts() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }

    }


    @PostConstruct
    private void addProduct() {
        for (int i = 0; i < 5; i++) {
            products.add(new Product("Product" + i, 100 + i));
        }
    }

}
