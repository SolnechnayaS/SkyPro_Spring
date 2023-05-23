package org.ru.skypro.lessons.spring.config.pojo;

import java.util.List;

public class Pickup extends Transport{

    private Tonnage tonnage;

    public Pickup(String brand, String model, int year, String country, String color, int maxSpeed, Tonnage tonnage) {
        super(brand, model, year, country, color, maxSpeed);
        this.tonnage=tonnage;
    }
    public Tonnage getTonnage() {
        return tonnage;
    }

    public void setTonnage(Tonnage tonnage) {
        this.tonnage = tonnage;
    }

    public enum Tonnage {
        N1(null, 3.5f),
        N2(3.5f,12f),
        N3(12f,null);

        private Float minTonnage;
        private Float maxTonnage;

        Tonnage(Float minTonnage, Float maxTonnage) {
            this.minTonnage = minTonnage;
            this.maxTonnage = maxTonnage;
        }

        public float getMinTonnage() {
            return minTonnage;
        }

        public void setMinTonnage(Float minTonnage) {
            this.minTonnage = minTonnage;
        }

        public float getMaxTonnage() {
            return maxTonnage;
        }

        public void setMaxTonnage(Float maxTonnage) {
            this.maxTonnage = maxTonnage;
        }


        @Override
        public String toString() {
            String tonnage = "грузоподъемность: ";
            if (minTonnage == null || minTonnage ==0) {
                tonnage = tonnage+ "до " + maxTonnage + " тонн";
            }
            else if (maxTonnage == null || maxTonnage == 0) {
                tonnage = tonnage + "свыше " + minTonnage + " тонн";
            }
            else {
                tonnage = tonnage + "от " + minTonnage + " до " + maxTonnage + " тонн";
            }
            return tonnage;
        }

    }
}
