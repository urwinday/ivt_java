package com.urwinday.lesson1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println();

        Cat cat = new Cat("Matvey", "White" , 14);
        Cat cat2 = new Cat("Lucky", "Grey" , 11);

        cat.info();
        cat2.info();
    }
}