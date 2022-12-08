package org.example;

import java.util.List;

public class MyArrayList implements List {

  public Object[] arr;
  public int elements;

  public MyArrayList() {
    this.arr = new Object[10];
    this.elements = 0;
  }

  public boolean add(Object n) {
    if (this.arr.length == this.elements) {

      int elementTemp = 0;
      Object[] tempArr = new Object[this.arr.length * 2];

      for (int i = 0; i < this.arr.length; i++, elementTemp++) {

        tempArr[elementTemp] = this.arr[i];
      }

      this.arr = null;
      this.arr = new Object[tempArr.length];
      this.arr = tempArr;
    }

    this.arr[this.elements] = n;
    this.elements++;

    return true;
  }

  public Object get(int index) {
    Object hold = null;

    hold = this.arr[index];

    return hold;
  }

  public int size() {
    return elements;
  }

  public void clear() {

    for (int i = 0; i < arr.length; i++) {
      this.arr[i] = null;
      this.elements--;
    }

  }
}
