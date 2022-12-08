package org.example;

public class CustomLL<K,V> {
  Node<K,V> head;

  public CustomLL() {
    this.head = null;
  }

  public void insertEnd(K key, V value) {
    Node newNode = new Node(key, value);
    if (head == null) {
      head = newNode;
    } else {
      Node currentNode = head;
      while (currentNode.next != null) {
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
    }
  }

  public void insertStart(K key, V value) {
    Node newNode = new Node(key, value);
    newNode.next = head;
    head = newNode;
  }

  public void insertAt(int index, K key, V value) {
    if (index == 0) {
      insertStart(key, value);
    } else {
      Node newNode = new Node(key, value);
      Node curr = head;
      for (int i = 0; i < index - 1; i++) {
        curr = curr.next;
      }
      newNode.next = curr.next;
      curr.next = newNode;
    }
  }

  public void deleteAt(int index) {
    if (index == 0) {
      head = head.next;
    } else {
      Node curr = head;
      for (int i = 0; i < index - 1; i++) {
        curr = curr.next;
      }
      curr.next = curr.next.next;
    }
  }

  public void deleteKey(K key) {
    Node curr = head;
    if (curr == null) {
      System.out.println("Empty LL can't delete " + key);
    } else {
      while (curr.next.key != key) {
        curr = curr.next;
      }
      curr.next = curr.next.next;
    }
  }

  public void show() {
    Node curr = head;
    if (curr == null) {
      System.out.println("Empty LL");
    } else {
      while (curr != null) {
        System.out.println("Key: " + curr.key + "\tValue: " + curr.val);
        curr = curr.next;
      }
    }
  }
}
