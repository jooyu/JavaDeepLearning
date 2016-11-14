package com.zy.Iterator;

import java.util.List;

class ConcreteAggregate implements Aggregate {
  private List<Object> list;

  public ConcreteAggregate(List<Object> list) {
      this.list = list;

  }

  public void add(Object obj) {
      list.add(obj);

  }

  public Iterator iterator() {
      // TODO Auto-generated method stub
      return new ConcreteIterator(list);
  }

  public void remove(Object obj) {
      list.remove(obj);

  }

}