package com.urwinday.lesson2;

public class Duck implements Flyable, Swimable{

    @Override
    public void fly() {
        System.out.println("Fly duck");
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }
}
