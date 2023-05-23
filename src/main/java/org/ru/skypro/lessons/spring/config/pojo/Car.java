package org.ru.skypro.lessons.spring.config.pojo;

import java.util.List;

public class Car extends Transport {
    public BodyType bodyType;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, BodyType bodyType) {
        super(brand, model, year, country, color, maxSpeed);
        this.bodyType=bodyType;
    }


    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбек"),
        COUPE("Купе"),
        ESTATE("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }
        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "тип кузова: " + bodyType;
        }
    }

}
