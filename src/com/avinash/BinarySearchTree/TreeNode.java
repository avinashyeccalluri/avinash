package com.avinash.BinarySearchTree;

/**
 * TreeNode
 */
public class TreeNode {

  private int data;
  private TreeNode leftNode;
  private TreeNode rightNode;
  public  void insert(int value){
      if(value== data){
        return;
      }
      if(data<value){
        if(leftNode==null){
          leftNode=new TreeNode(value);
        }else{
          leftNode.insert(value);
        }
      }else{
        if(rightNode==null){
          rightNode=new TreeNode(data);
        }else{
          rightNode.insert(value);
        }
      }
  }
  
  public TreeNode(int data) {
    this.data=data;
  }
  public int getData() {
    return this.data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public TreeNode getLeftNode() {
    return this.leftNode;
  }

  public void setLeftNode(TreeNode leftNode) {
    this.leftNode = leftNode;
  }

  public TreeNode getRightNode() {
    return this.rightNode;
  }

  public void setRightNode(TreeNode rightNode) {
    this.rightNode = rightNode;
  }

}