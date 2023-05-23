package org.ru.skypro.lessons.spring.config;

import org.ru.skypro.lessons.spring.config.pojo.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Car car() {
        return new Car("Lada", "Granta", 2000,"Russia", "eggplant", 150, Car.BodyType.SEDAN);
    }

    @Bean
    public Bus bus() {
        return new Bus("Ikarus", "345", 2000, "Hungary","red", 100,"standart");
    }

    @Bean
    public Pickup pickup() {
        return new Pickup("Kamaz", "5490", 2000, "Russia","yellow", 250, Pickup.Tonnage.N2);
    }

    @Bean
    public Driver driverCar() {
        return new Driver("Ivanov I.I.", car());
    }

    @Bean
    public Driver driverBus() {
        return new Driver("Petrov P.P.", bus());
    }

    @Bean
    public Driver driverPickup() {
        return new Driver("Sidorov S.S.", pickup());
    }

}
