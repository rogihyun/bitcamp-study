package com.eomcs.lms.util;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("eee");
    list.add("fff");
    list.add("ggg");
    
    System.out.println(list.set(0, "xxx"));;
    System.out.println();
    pirint(list);
    
  }
  static void pirint(LinkedList<String> list) {
    Object[] arr = list.toArray();
    for(Object value : arr) {
      System.out.println(value);
    }
  }
}
