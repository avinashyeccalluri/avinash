package com.avinash.LinearSearch;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    int[] a={1,2,4,5,6,7,8,9};
    System.out.println(Searchingnumber(a, 3));
  }
  public static int Searchingnumber(int[] someArray,int someNumber){
    for (int i = 0; i < someArray.length; i++) {
      if(someArray[i]==someNumber){
        return 1;
      }
    }return -1;
  }
}