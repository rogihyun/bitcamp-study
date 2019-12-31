package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Lesson;

public class LessonList {
  
  static final int LESSON_SIZE = 100;
  
  Lesson[] list;
  int size = 0;
  
  public LessonList() {
    this.list = new Lesson[LESSON_SIZE];
  }
  public LessonList(int capacity) {
    if(capacity < LESSON_SIZE || capacity > 100000)
      this.list = new Lesson[LESSON_SIZE];
    else
      this.list = new Lesson[capacity];
  }
  public Lesson[] toArray() {
    /*
    Lesson[] arr= new Lesson[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }*/
    return Arrays.copyOf(this.list, this.size);
  }
  public void add(Lesson lesson) {
    if(this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = lesson;
  }
  
  public Lesson get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
}
