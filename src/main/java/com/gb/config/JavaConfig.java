package com.gb.config;

import com.gb.spring.OrderNameService;
import com.gb.spring.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {

    @Bean
    public OrderService orderService(OrderNameService orderNameService) {
        return new OrderService(orderNameService);
    }

    @Bean
    public OrderNameService orderNameService() {
        return new OrderNameService();
    }

    @Bean
    public String firstStringBean() {
        return "I am first string bean";
    }

    @Bean("second")
    public String secondStringBean() {
        return "I am second string bean";
    }

}
