package com.avinash.Stack;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkStack {
    private LinkedList<Employee> stack;

    public LinkStack(){
        stack=new LinkedList<>();
    }
    public void push(Employee employee){
        stack.push(employee);
    }
    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size(){
        return stack.size();
    }

    public void printStack(){
        for (Employee i:stack) {
            System.out.println(i);
        }
    }
}
