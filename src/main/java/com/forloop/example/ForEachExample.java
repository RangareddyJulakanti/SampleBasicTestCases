package com.forloop.example;

import com.forloop.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {

        List<Employee> data = prepareEmployeeList();
        Employee e = findEmployeeById(data, 10);
        System.out.println(e);
    }

    public static Employee findEmployeeById(List<Employee> data, int id) {
        for (Employee currentEmp : data) {
            if (currentEmp.getId() == id) {
                return currentEmp;
            }
        }
        return null;
    }

    private static List<Employee> prepareEmployeeList() {
        Employee e1=new Employee(10, "ranga", 1000);
        Employee e2=new Employee(11, "raju", 2000);
        Employee e3=new Employee(12, "kiran", 3000);
        Employee e4=new Employee(13, "kumar", 4000);
        List<Employee> data = new ArrayList<>();
        data.add(e1);
        data.add(e2);
        data.add(e3);
        data.add(e4);
        return data;
    }
}
