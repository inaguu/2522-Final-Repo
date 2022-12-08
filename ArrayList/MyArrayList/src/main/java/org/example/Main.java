package org.example;

public class Main {
  public static void main(String[] args) {

    MyArrayList marl = new MyArrayList();
    marl.add("Hello");
    marl.add("world");
    marl.add("!");
    for (int i = 0; i < marl.size(); i++) {
      System.out.println(marl.get(i));
    }

    System.out.println("Hello world!");
  }
}