package com.avinash.BinarySearch;

/**
 * BinarySearch
 */
public class BinarySearch {

  public static void main(String[] args) {
    int[] intArray={-22,-15,1,7,20,35,55};
    // System.out.println(iterativeSearch(intArray, 1));
    System.out.println(recursiveBinarySearch(intArray, 1));
  }
  public static int iterativeSearch(int[] array,int value){
    int start=0;
    int end=array.length;
    
    while(start < end){
    int mid=(start+end)/2;
      if(array[mid]==value){ 
        return mid;
      }else if(array[mid]<value){
        start=mid+1;
      }else{
          end=mid;
      }
    }return -1;
  }
  public static int recursiveBinarySearch(int[] array,int value){
    return recursiveBinarySearch(array, 0,array.length,value);
  }
  public static int recursiveBinarySearch(int[] array,int start,int end,int value){
    if(start>=end){
      return -1;
    }
    int mid=(start+end)/2;
    if(array[mid]==value){
      return mid; 
    }else if(array[mid]<value){
      return recursiveBinarySearch(array, mid+1, end, value);
    }else{
      return recursiveBinarySearch(array, start, mid, value);
    }
  }
}