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
        List<Employee> data = new ArrayList<>();
        data.add(new Employee(10, "ranga", 1000));
        data.add(new Employee(11, "raju", 2000));
        data.add(new Employee(12, "kiran", 3000));
        data.add(new Employee(13, "kumar", 4000));
        return data;
    }
}
