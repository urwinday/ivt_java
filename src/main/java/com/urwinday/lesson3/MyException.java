package com.urwinday.lesson3;

public class MyException extends RuntimeException {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
