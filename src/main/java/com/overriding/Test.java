package com.overriding;

public class Test {
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1=new Child1();
       // System.out.println( ((Child) p1).m2());
        System.out.println(p1.m1());
//static methods will not ovverride
// in this case reference type is important to resolve method callm1() static polymorphism
//instance methods can ovverride
        //in this case runtime object will decide the method call runtime polymorphism
    }
}
