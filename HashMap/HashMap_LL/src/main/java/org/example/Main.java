package org.example;

public class Main {
  public static void main(String[] args) {

    CustomLL<Integer, String> ll = new CustomLL<>();

    for (int i = 1; i <= 15; i++) {
      ll.insertEnd(i, "I am node " + i);
    }

    ll.show();

    System.out.println("Hello world!");
  }
}