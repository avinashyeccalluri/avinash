package com.avinash.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee avinashyeccalluri=new Employee("Avinash","yeccalluri",1);
        Employee kaneshyeccalluri=new Employee("kanesh","yeccalluri",2);
        EmployeeDoubleLinkedList list=new EmployeeDoubleLinkedList();
        list.addToFront(avinashyeccalluri);
        list.addToFront(kaneshyeccalluri);
        list.printList();
//        System.out.println(list.isEmpty());
        // Employee avinashchitra=new Employee("chitra","avinash",1);
//        System.out.println(list.getSize());
//
//        System.out.println(list.getSize());
        // list.addToEnd(new Employee("chitra","avinash",1));
        // list.printList();
//
//        list.removeFromFront();
//        list.printList();
        // list.removeFromEnd();
        // list.printList();
    }




}
