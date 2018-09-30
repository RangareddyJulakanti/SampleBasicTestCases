package com.exception.checkedUncheked;

import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
       // m2();
        m1();
    }

    private static void m1() {
        //System.out.println(10/0);
        throw new ArithmeticException("/by zero");
    }

    private static void m2() throws FileNotFoundException {
        throw new FileNotFoundException("file not found");
    }
}
