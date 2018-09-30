package com.forloop.example;

import com.forloop.model.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForLoopExampleTest {
    List<Employee> empList=new ArrayList<>();
    ForLoopExample forLoopExample;

    @Before
    public void init(){
        forLoopExample=new ForLoopExample();
        empList.add(new Employee(10,"ranga",1000));
        empList.add(new Employee(11,"raju",2000));
        empList.add(new Employee(12,"kiran",3000));
        empList.add(new Employee(13,"kumar",4000));
    }
    @Test
    public void testRemoveElementByByIndex(){
        ForLoopExample.removeElementByByIndex(empList,0);
        Assert.assertEquals(empList.size(),3);
        ForLoopExample.removeElementByByIndex(empList,0);
        Assert.assertEquals(empList.size(),2);
        Assert.assertEquals(empList.get(0).getName(),"kiran");
        Assert.assertFalse(empList.isEmpty());
    }
    @Test
    public void testSampleMockito(){
        List<Employee> mockList=mock(List.class);
        when(mockList.get(1)).thenReturn(new Employee(20,"akhil",3000));
        Employee e= mockList.get(1);
        Assert.assertEquals(e.getName(),"akhil");
        Assert.assertEquals(e.getId(),20);
    }
    @Test
    public void testSampleMockito_1(){
        List<Employee> mockList=mock(List.class);
        when(mockList.get(1)).thenThrow(new RuntimeException("EmptyList"));
        when(mockList.get(2)).thenReturn(new Employee(20,"akhil",3000));
        mockList.get(2);
    }
}
