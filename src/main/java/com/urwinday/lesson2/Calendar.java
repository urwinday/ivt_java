package com.urwinday.lesson2;

public class Calendar {
    Months month = Months.DECEMBER;

    public  void currentDateInfo() {
        Months.values();
//        Months.valueOf("December"); // IllegalArgumentException: No enum constant com.urwinday.lesson2.Months.December
        System.out.println(month.getNumber() + " ");

    }
}
