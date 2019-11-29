package com.avinash.LinkedList;

//import java.util.ArrayList;
//import java.util.List;
public class Main {
    public static void main(String[] args) {
        Employee Avinashyeccalluri=new Employee("Avinash","yeccalluri",1);
        Employee kaneshyeccaluri=new Employee("Kanesh","yeccalluri",2);
        EmployeeLinkedList list=new EmployeeLinkedList();
//        System.out.println(list.isEmpty());
        list.addToFront(new Employee("Avinash","yeccalluri",1));
        list.addToFront(kaneshyeccaluri);
        list.printList();
//        list.addToFront(new Employee("chitra","Avinash",12));
//        System.out.println(list.getSize());
//        list.printList();
//        list.printList();
//        System.out.println(list.isEmpty());
//        list.removeFromFront();
//        System.out.println(list.getSize());
//        list.returnType();

    }
}
