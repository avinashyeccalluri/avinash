package com.avinash.HashTable;

/**
 * SimpleHashtable
 */
public class SimpleHashtable {

  private Employee[] hastable;
  public SimpleHashtable (){
    hastable=new Employee[10];
  }
  public void put(String key,Employee employee){
    int hashedKey=hasKey(key);
    if(hastable[hashedKey]!=null){      
      System.out.println("Array index taken, the array index is "+hashedKey);
    }
    else{
      hastable[hashedKey]=employee;
    }

  }
  public Employee get(String key){
    int hashedKey=hasKey(key);
    return hastable[hashedKey];
  }
  private int hasKey(String key){
    return key.length() % hastable.length;
  }
  public void printHashTable(){
    for (Employee employee : hastable) {
      System.out.println(employee);
    }
  }
}