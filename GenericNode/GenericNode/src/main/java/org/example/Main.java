package org.example;

public class Main {
  public static void main(String[] args) {
    GenericLL<String> ll = new GenericLL<>();

    for (int i = 0; i <= 15; i++) {
      ll.insert("i am " + i);
    }

    GenericNode<String> temp = ll.head;

    while (temp != null) {
      System.out.println(temp.val);
      temp = temp.next;
    }

    System.out.println("Hello world!");
  }
}