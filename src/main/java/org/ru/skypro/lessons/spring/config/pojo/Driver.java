package org.ru.skypro.lessons.spring.config.pojo;

public class Driver {
    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public void startTheTransport() {
        System.out.println(name + " сел(а) в " + transport.getModel());
        transport.start();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "car=" + transport +
                '}';
    }
}
