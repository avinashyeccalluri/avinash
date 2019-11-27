package com.avinash.Queue;

import java.util.LinkedList;

/**
 * LinkedListQueue
 */
public class LinkedListQueue {

    private LinkedList<Employee> QueueLinkedList;
    public void add(Employee employee){
        if(QueueLinkedList.size()==0){
        QueueLinkedList.add(employee);}
        else{
            QueueLinkedList.addLast(employee);
        }
    }
    public Employee remove(){
        return QueueLinkedList.removeFirst();
    }
    public Employee peek(){
        return QueueLinkedList.getFirst();
    }
    public boolean isEmpty(){
        return QueueLinkedList.isEmpty()==true;
    }
    public int size(){
        return QueueLinkedList.size();
    }
    public void printAll(){
        for (Employee employee : QueueLinkedList) {
            System.out.println(employee);
        }
    }
}