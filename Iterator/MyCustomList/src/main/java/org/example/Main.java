package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a"); //1st Element
    list.add("b");
    list.add("c"); //Second from 1st Element
    list.add("d");
    list.add("e"); //Second from 3rd Element
    list.add("f");
    list.add("g"); //Second from 5th Element
    list.add("h");

    CustomList<String> customList = new CustomList(list);
    for(String s: customList){
      System.out.println(s);
    }

//    while(customList.iterator().hasNext()) {
//      String value = customList.iterator().next();
//      if(customList.iterator().hasNext()) {
//        System.out.println(value);
//      }
//    }


    System.out.println("Hello world!");
  }
}