package com.avinash.Queue;

import java.util.EmptyStackException;

/**
 * CircularQueue
 */
public class CircularQueue {

  private Employee[] queue;
  private int front;
  private int end;

  public CircularQueue(int capacity){
          queue=new Employee[capacity];
  }
   public boolean isEmpty(){
       return end==0;
   }
   public int SizeOf(){
     if(front<=end){
       return end-front;}
       else{
         return end-front+queue.length;
       }
   }
   public void add(Employee employee){
       if(SizeOf()==queue.length-1){
         int someSize=SizeOf();
           Employee[] newArray=new Employee[2*queue.length];
           
           System.arraycopy(queue, front, newArray, 0, queue.length-front);
           System.arraycopy(queue, 0, newArray, queue.length-front, end);
          // System.arraycopy(src, srcPos, dest, destPos, length);
           queue=newArray;
           front=0;
           end=someSize;
       }
       if(end<queue.length-1){
         end++;
       }else{
         end=0;
       }
       queue[end]=employee;
       end++;
   }

   public Employee remove(){
       if(isEmpty()){
           throw new EmptyStackException();
       }else{
          Employee employee=queue[end];
          employee=null;
          front++;
          if(SizeOf()==0){
            front=0;end=0;
          }else if(front==queue.length){
              front=0;
          }
          return employee;
       }
   }

   public Employee peek(){
      if(isEmpty()){
          throw new EmptyStackException();
   }
   return queue[front];}

   public void printQueue(){
    if(front<=end){
      for(int i=front;i<end;i++){

      System.out.println(queue[i]);
  }
}else{
  for(int i=front;i<queue.length;i++){
    System.out.println(queue[i]);
  }
  for(int j=0;j<end;j++){
    System.out.println(queue[j]);
  }
}
          
   }


}