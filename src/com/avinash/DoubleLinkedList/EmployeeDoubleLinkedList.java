package com.avinash.DoubleLinkedList;

public class EmployeeDoubleLinkedList {
    //addtofront
    //addtoend
    //deletefromfront
    //deletefromback
    //size
    //isEmpty
    private EmployeeNode head;
    private EmployeeNode tail;
    int size;
    public void addToFront(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        if(head==null){
            tail=node;
        }else{
            node.setNext(head);
            head.setPrevious(node);           
        }
        head=node;
        size++;
    }
    //new Employee("chitra","avinash",1)
    public void addToEnd(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        if(tail==null){
            head=node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail=node;
        size++;

    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head==null;
    }
//-------------------------------------------------------------------
    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }EmployeeNode removedNode=head;
        if (head.getNext()==null){
            tail=null;
        }else{
            head.getNext().setPrevious(null);
        }
        head=head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }
    //---------------------------------------------------
    public EmployeeNode removeFromEnd(){
        if (isEmpty()){
            return null;
        }
        EmployeeNode removeNode=tail;
        if(tail.getPrevious()==null){
            head=null;
        }else{
            tail.getPrevious().setNext(null);
        }
        tail=tail.getPrevious();
        size--;
        removeNode.setPrevious(null);
        return removeNode;
    }

    public void printList(){
        EmployeeNode current=head;
        System.out.print("Head->");
        while(current!=null){
            System.out.print(current);
            System.out.print("<->");
            current=current.getNext();
        }
        System.out.println("null");
    }

}
