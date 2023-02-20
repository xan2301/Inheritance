package org.example.Cars;

public class Vehicle extends Car{

    public Vehicle(String name, int age) {
        super(name, age);
    }

    public String hasHair()
    {
        return "yes";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
