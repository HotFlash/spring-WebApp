package com.gb.spring;

import lombok.Getter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Cart {
    private static long id_sequence = 1L;
    @Getter
    private final long id;
    @Getter
    private List<Product> products;

    public Cart(List<Product> products) {
        this.products = products;
        this.id = id_sequence++;
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    public void DelProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
    }

}
