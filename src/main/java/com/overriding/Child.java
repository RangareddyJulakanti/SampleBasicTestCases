package com.overriding;

public class Child extends  Parent {
    public   StringBuffer m1(){
       return  new StringBuffer("iam in child m1()");
    }
    public String m2(){
        return  "iam in child m2()";
    }
}
