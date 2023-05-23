package org.ru.skypro.lessons.spring;

import org.ru.skypro.lessons.spring.config.AppConfig;
import org.ru.skypro.lessons.spring.config.pojo.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver1 = context.getBean("driverCar", Driver.class);
        driver1.startTheTransport();

        Driver driver2 = context.getBean("driverBus", Driver.class);
        driver2.startTheTransport();

        Driver driver3 = context.getBean("driverPickup", Driver.class);
        driver3.startTheTransport();
    }
}