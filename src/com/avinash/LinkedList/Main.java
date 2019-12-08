package com.avinash.LinkedList;

//import java.util.ArrayList;
//import java.util.List;
public class Main {
    public static void main(String[] args) {
        Employee Avinashyeccalluri=new Employee("Avinash","yeccalluri",1);
        Employee kaneshyeccaluri=new Employee("Kanesh","yeccalluri",2);
        Employee chitra=new Employee("chitra","govind",3);
        EmployeeLinkedList list=new EmployeeLinkedList();
        list.addToFront(Avinashyeccalluri);
        list.addToFront(kaneshyeccaluri);
        list.addToFront(chitra);
        list.printList();

    }
}
