package com.exception.checkedUncheked;

public class Test3 {
    public static void main(String[] args) {
        try {
            System.out.println(add(10, -20));
        }catch (InvalidInputException e){
            System.out.println(e.getMessage());
        }
    }
    public static  int add(int a,int b){
        if(a<0||b<0){
            throw new InvalidInputException("a and b should be grater than 0 but  a="+a+" b="+b);
        }
        return a+b;
    }
}
