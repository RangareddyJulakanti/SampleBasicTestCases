package com.forloop.example;

import com.forloop.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExample {
    public static void main(String[] args) {
        List<Employee> data=prepareEmployeeList();
        removeElementByByIndex(data,2);
    }

    public static void removeElementByByIndex(List<Employee> data,int index) {
        for(int i=0;i<data.size();i++){
            if(i==index){
                data.remove(data.get(i));
            }
        }
        System.out.println(data);
    }

    private static List<Employee> prepareEmployeeList() {
        List<Employee> data=new ArrayList<>();
        data.add(new Employee(10,"ranga",1000));
        data.add(new Employee(11,"raju",2000));
        data.add(new Employee(12,"kiran",3000));
        data.add(new Employee(13,"kumar",4000));
        return data;
    }
}
