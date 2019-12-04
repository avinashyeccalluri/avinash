package com.avinash.Queue;
import com.avinash.Queue.Employee;

import com.avinash.Queue.ArrayQueue;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Employee employee=new Employee("Avinash", "yeccalluri", 1);
        Integer ao=2;
        //
        Employee employee1=new Employee("Kanesh", "yeccalluri", 2);
        Employee employee2=new Employee("Kanesh", "yeccalluri", 3);
        Employee employee3=new Employee("Kanesh", "yeccalluri", 4);
        Employee employee4=new Employee("Kanesh", "yeccalluri", 5);
        LinkedListQueue queue1 =new LinkedListQueue();
        // System.out.println(queue1.isEmpty());
        queue1.add(employee);
        queue1.add(employee1);
        queue1.add(employee2);
        queue1.add(employee3);
        queue1.add(employee4);


    }
}