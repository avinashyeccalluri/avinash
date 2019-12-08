package com.avinash.Stack;

public class Main {
    public static void main(String[] args) {
    //    ArrayStack stack=new ArrayStack(new Employee("Avinash","yeccalluri",1));
       ArrayStack stack=new ArrayStack(10);
       stack.push(new Employee("avinash","yeccalluri",1));
       stack.push(new Employee("kanesh","yeccalluri",2));
    //    stack.printStack();
    //    stack.pop();
       stack.printStack();
       System.out.println(stack.size());
       stack.printStack();

//         LinkStack stack1=new LinkStack();
//         stack1.push(new Employee("avinash","yeccalluri",1));
//         stack1.push(new Employee("kanesh","yeccalluri",2));
//         stack1.printStack();
//         System.out.println(stack1.size());
//         stack1.pop();
//         System.out.println(stack1.size());
// //        System.out.println(stack1.size());
//         stack1.printStack();


    }

}
