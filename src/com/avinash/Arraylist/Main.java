package com.avinash.Arraylist;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Avinash","yeccalluri",1));
        employeeList.add(new Employee("Kanesh","yeccalluri",2));
        employeeList.add(new Employee("Chitra","Avinash",3));
        employeeList.add(new Employee("baskar","sujatha",4));
//        employeeList.forEach(i-> System.out.println(i));
        Employee[] employeeArray=employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee i:employeeArray){
            System.out.println(i);
        }
        System.out.println(employeeList.contains(new Employee("Avinash","yeccalluri",1)));
        System.out.println(employeeList.indexOf(new Employee("Avinash","yeccalluri",1)));
    }
}
