package com.ub.cse.workshop.springstartupsvc;

import com.ub.cse.workshop.springstartupsvc.model.Customers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringStartupSvcApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringStartupSvcApplication.class, args);
        Customers customer = context.getBean(Customers.class);
        customer.display();
    }

}
