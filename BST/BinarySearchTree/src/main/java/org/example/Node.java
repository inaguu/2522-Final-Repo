package org.example;

public class Node<K,V> {

  K key;
  V val;

  Node<K,V> left;
  Node<K,V> right;

  public Node(K key, V val) {
    this.key = key;
    this.val = val;
    left = null;
    right = null;
  }

}
