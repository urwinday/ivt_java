package com.urwinday.lesson2;

public enum Months {
    NOVEMBER(11), DECEMBER(12);

    private int number;

    Months(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
