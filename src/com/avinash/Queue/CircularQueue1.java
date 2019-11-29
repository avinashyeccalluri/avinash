package com.avinash.Queue;

/**
 * CircularQueue1
 */
public class CircularQueue1 {

    private Employee[] queue;
    private int front;
    private int end;
    
    public CircularQueue1(){
        queue=new Employee[10];
    }

    //push
    //pop
    //peek
    //size
    //isempty

    public int size(){
        if(front<=end){
            return end-front;
        }else{
            return end-front-queue.length;
        }
    }

    public void push(Employee employee){
        if(size()==queue.length){
            Employee[] newArray=new Employee[2*queue.length];
            System.arraycopy(queue, front, newArray, front, queue.length-front);
            System.arraycopy(queue, 0, newArray, queue.length-front, end);
        }
        if(end<queue.length-1){
            end++;
        }else if(end==queue.length){
                end=0;
        }
        queue[end]=employee;
    }

    public Employee peek(){
        return queue[front];
    }

    public Employee pop(){
        
    }

}