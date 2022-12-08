package org.example;

public class Main {
  public static void main(String[] args) {

    MyBST<Integer, String> bst = new MyBST<>();

    bst.insert(0, "Hello node " + 0);
    bst.insert(-1, "Hello node " + -1);
    bst.insert(1, "Hello node " + 1);
    bst.insert(2, "Hello node " + 2);
    bst.insert(-2, "Hello node " + -2);

    bst.getKey(1);

    System.out.println("Hello world!");
  }
}