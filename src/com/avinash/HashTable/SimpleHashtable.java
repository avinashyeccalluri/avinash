package com.avinash.HashTable;

/**
 * SimpleHashtable
 */
public class SimpleHashtable {

  private StoredEmployee[] hastable;
  public SimpleHashtable (){
    hastable=new StoredEmployee[10];
  }
  public void put(String key,Employee employee){
    int hashedKey=hasKey(key);
    if(occupied(hashedKey)){
      int stopIndex=hashedKey;
    if(hashedKey==hastable.length-1){
      hashedKey=0;
    }else{
      hashedKey++;
    }
      while(occupied(hashedKey) && hashedKey!=stopIndex){
        hashedKey=(hashedKey+1)%hastable.length;
      }    
  }
  if(occupied(hashedKey)){
    System.out.println("the index is occupied at the index");
  }else{
    hastable[hashedKey]=new StoredEmployee(key,employee);
  }  
  }
  
  private boolean occupied(int index){
    return hastable[index]!=null; 
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

  private int findKey(String key){
    int hashedKey=hasKey(key);
    if(hastable[hashedKey]!=null && hastable[hasKey(key).key.equals(key)]){
      return hashedKey;
    }
  }
}