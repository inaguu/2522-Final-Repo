package org.example;

public class MyBST<K extends Comparable<K>, V> {

  public Node<K,V> cur;

  public void insert(K key, V val) {
    Node<K,V> root = cur;

    if (cur == null) {
      cur = new Node<>(key, val);
      return;
    }

    while(true) {
      if(key.compareTo(root.key) < 0) {
        if (root.left == null) {
          root.left = new Node<>(key, val);
          return;
        } else {
          root = root.left;
        }
      }
      if (key.compareTo(root.key) > 0) {
        if (root.right == null) {
          root.right = new Node<>(key, val);
          return;
        } else {
          root = root.right;
        }
      }
    }
  }

  public void getKey(K key) {
    Node<K,V> temp = cur;

    while (temp != null) {
      if (key.compareTo((K) temp.key) > 0) {
        if (key.compareTo((K)temp.key) == 0) {
          System.out.println("I am key " + temp.key + "val = " + temp.val);
          return;
        } else {
          temp = temp.right;
        }
      }
      if (key.compareTo((K)temp.key) < 0) {
        if (key.compareTo((K)temp.key) == 0) {
          System.out.println("I am key " + temp.key + "val = " + temp.val);
          return;
        } else {
          temp = temp.left;
        }
      }
    }
  }
}
