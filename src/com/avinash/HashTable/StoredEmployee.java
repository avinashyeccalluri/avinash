package com.avinash.HashTable;

/**
 * StoredEmployee
 */
public class StoredEmployee {

  public String key;
  public Employee employee;


  public StoredEmployee() {
  }
  public StoredEmployee(String key,Employee employee){
    this.key=key;
    this.employee=employee;
  }
}