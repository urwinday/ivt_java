package com.urwinday.lesson1;

public class Cat {
    String name;
    String color;
    int age;

    public Cat() {
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info(){
        System.out.println(name + " " + color + " " + age);
    }

    public void meow() {
        System.out.println(name + " meow");
    }


}