package com.avinash.GetToKnow;


public class Main{
    public static void main(String[] args) {
        Employee employee1;
        Employee employee2=new Employee();
        employee2.setFirstName("Avinash");
        employee1=employee2;
        System.out.println(employee1);
    }
}

