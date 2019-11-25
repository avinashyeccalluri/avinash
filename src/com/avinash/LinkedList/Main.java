package com.avinash.LinkedList;

//import java.util.ArrayList;
//import java.util.List;
public class Main {
    public static void main(String[] args) {
        Employee Avinashyeccalluri=new Employee("Avinash","yeccalluri",1);
        Employee kaneshyeccaluri=new Employee("Kanesh","yeccalluri",1);
        EmployeeLinkedList list=new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(Avinashyeccalluri);
        list.addToFront(kaneshyeccaluri);
        list.addToFront(new Employee("chitra","Avinash",12));
        System.out.println(list.getSize());
        list.printList();
        System.out.println(list.isEmpty());
        list.removeFromFront();
        System.out.println(list.getSize());

    }
}
