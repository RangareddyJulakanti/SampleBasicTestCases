package com.exception;

public class Test {
    public static void main(String[] args) {
        try {
            m1();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("iam in main()");
    }

    private static void m1() {
        try {
            m2();
        }catch (Exception e){
           // System.out.println("exception raised in m1() but continue the remaining execution "+e.getMessage());
           throw e;
        }
        System.out.println("iam in m1();");
    }

    private static void m2() {
        System.out.println(10/0);
    }
}
