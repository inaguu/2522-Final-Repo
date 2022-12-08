package org.example;

public class GenericLL<T> {

  GenericNode<T> head;
  GenericNode<T> cur;

  public GenericLL() {
    this.head = null;
  }

  public void insert(T val) {
    GenericNode<T> newNode = new GenericNode<>(null, val);
    if (head == null) {
      head = newNode;
      cur = head;
    } else {
      cur.next = new GenericNode<>(cur, val);
      cur = cur.next;
    }
  }
}
