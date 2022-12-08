package org.example;

public class GenericNode<T> {

  GenericNode<T> next;
  T val;
  GenericNode<T> parent;

  public GenericNode(GenericNode<T> parent, T val) {
    this.val = val;
    this.parent = parent;
    this.next = null;
  }

  public T getVal() {
    return val;
  }

  public void setVal(T val) {
    this.val = val;
  }

  public GenericNode<T> getNext() {
    return next;
  }

  public void setNext(GenericNode<T> next) {
    this.next = next;
  }
}
