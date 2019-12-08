package com.avinash.Queue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * ArrayQueue
 */
public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int end;

    public ArrayQueue(int capacity){
            queue=new Employee[capacity];
    }
     public boolean isEmpty(){
         return end==0;
     }
     public int SizeOf(){
         return end-front;
     }
     public void add(Employee employee){
         if(end==queue.length){
             Employee[] newArray=new Employee[2*queue.length];
             System.arraycopy(queue, 0, newArray, 0, queue.length);
             queue=newArray;
         }
         queue[end]=employee;
         end++;
     }

     public Employee remove(){
         if(isEmpty()){
             throw new NoSuchElementException();
         }else{
            Employee employee=queue[end];
            employee=null;
            front++;
            return employee;
         }
     }

     public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
     }
     return queue[front];}

     public void printQueue(){
            for(int i=front;i<end;i++){
                
                System.out.println(queue[i]);
            }
     }


}