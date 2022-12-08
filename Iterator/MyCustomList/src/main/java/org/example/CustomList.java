package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomList<T> implements Iterable<T> {

  List<T> list;

  CustomList(List<T> list) {
    this.list = list;
  }

  public void add(T s) {
    list.add(s);
  }

  public T getFirst() {
    return list.get(0);
  }

  public T getLast() {
    return list.get(list.size() - 1);
  }

  public Iterator<T> iterator() {
    return new SecondIterator();
  }

  class SecondIterator<T> implements Iterator<T> {

    private int current = 0;
    private int size = list.size();

    //Return true if the second element exists
    @Override
    public boolean hasNext() {
      return size - current > 1;
    }

    //Return Second element from the list
    @Override
    public T next() {

      if(!hasNext())
        throw new NoSuchElementException();
      T t = (T) list.get(current);
      current+=2;
      return t;
    }
  }
}

