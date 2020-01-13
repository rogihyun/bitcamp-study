package com.eomcs.lms.util;

public class Queue2<E> extends LinkedList<E> implements Cloneable {

  public void offer(E value) {
    this.add(value);
  }
  public E poll() {
    return this.remove(0);
  }
  
  /*
  @SuppressWarnings("rawtypes")
  @Override
  public Queue clone() {
    try {
      return (Queue) super.clone();
    } catch(CloneNotSupportedException ex) {
      System.out.println(ex);
      return null;
    }
  }*/

public Queue<E> clone() {
   Queue<E> temp = new Queue<E>();
   for(int i = 0; i < this.size(); i++) {
     temp.offer(this.get(i));
   }
   return temp;
 }
}
