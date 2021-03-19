package com.company;

public class Car {
    private String color;
    private String brand;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public void Run(){
        System.out.print(color +" " +
                brand + " is running!"  );
    }
}
