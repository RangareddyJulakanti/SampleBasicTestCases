package com.forloop.example;

import com.forloop.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class WhileLoopExample {
    public static void main(String[] args) {
        //get Employee list
        List<Employee> data=prepareEmployeeList();
        //display before update
        System.out.println(data);
        incrementSalaryById(data,12);
        //Disply updated list
        System.out.println(data);

    }

    private static void incrementSalaryById(List<Employee> data,int id) {
        //crete iterator on list
        ListIterator<Employee> iterator= data.listIterator();
        //iterate list until it reach empty
        while(iterator.hasNext()){
           Employee currentEmp= iterator.next();
           if(currentEmp.getId()==id){
               currentEmp.setSalary(currentEmp.getSalary()*2);
               iterator.set(currentEmp);
           }
        }
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
