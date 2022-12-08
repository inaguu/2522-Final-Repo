package org.example;

public class Node<K,V> {

  K key;
  V val;
  Node<K,V> next;

  public Node(K key, V val) {
    this.key = key;
    this.val = val;
    next = null;
  }
}
