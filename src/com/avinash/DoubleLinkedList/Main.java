package com.avinash.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee avinashyeccalluri=new Employee("Avinash","yeccalluri",1);
        Employee kaneshyeccalluri=new Employee("kanesh","yeccalluri",2);
        EmployeeDoubleLinkedList list=new EmployeeDoubleLinkedList();
        list.addToFront(avinashyeccalluri);
        list.addToFront(kaneshyeccalluri);
        list.addToEnd(avinashyeccalluri);
        list.printList();
    }
}
