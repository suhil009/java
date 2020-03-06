package com.company;

class CAR {
    private int cylinders;
    private int wheels;
    private String name;
    private boolean engine;

    public CAR(int cylinders, String name) {
        boolean engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "engine is starting";
    }

    public String accelerate() {
        return "car accelerating ";
    }

    public String brake () {
        return  "Car is slowing down";
    }
}
class Gmc extends CAR{
    @Override
    public String startEngine() {
        return "Gmc is starting";
    }

    @Override
    public String accelerate() {
        return "gmc is accelerating";
    }

    @Override
    public String brake() {
        return "GMC is slowing down";
    }

    public Gmc(int cylinders, String name) {
        super(cylinders, name);

    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        CAR car = new CAR(6,"base Car");
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine());
    }
}
