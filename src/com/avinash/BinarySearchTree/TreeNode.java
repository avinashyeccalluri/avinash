package com.avinash.BinarySearchTree;

/**
 * TreeNode
 */
public class TreeNode {

  private int data;
  private TreeNode leftChild;
  private TreeNode rightChild;

  public TreeNode(int data){
    this.data=data;
  }
  public TreeNode get(int value){
    if(data==value){
      return this;
    }
    if(value<data){
      if(leftChild!=null){
        return leftChild.get(value);
      }
    }
      else{
        if(rightChild!=null){
          return rightChild.get(value);
        }
      }
    
    return null;
  }

  public void insert(int value){
    if (data==value) {
      return;
    }
    if(data>value){
      if(leftChild==null){
        leftChild=new TreeNode(value);
      }else{
        leftChild.insert(value);
      }
    }else{
      if(rightChild==null){
        rightChild=new TreeNode(value);
      }else{
        rightChild.insert(value);
      }
    }
  }
  public void traverseInOrder(){
    if(leftChild!=null){
      leftChild.traverseInOrder();
    }
    System.out.println("Data= "+data+", ");
    if(rightChild!=null){
      rightChild.traverseInOrder();
    }
  }
  public int getData() {
    return this.data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public TreeNode getLeftChild() {
    return this.leftChild;
  }

  public void setLeftChild(TreeNode leftChild) {
    this.leftChild = leftChild;
  }

  public TreeNode getRightChild() {
    return this.rightChild;
  }

  public void setRightChild(TreeNode rightChild) {
    this.rightChild = rightChild;
  }
  public String toString(){
    return "Data->"+data;
  }

  public int min(){
    if(leftChild==null){
      return data;
    }else{
      return leftChild.min();
    }
  }
  public int max(){
    if(rightChild==null){
      return data;
    }else{
      return rightChild.max();
    }
  }

}