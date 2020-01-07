package com.eomcs.oop.ex08.Test;

public class L {
  // field
  static int a; // 클래스 필드 = 스태틱 필드
  String b;     // 인스턴스 필드 = 논 스태틱 필드
  
  // method
  static void m1() {}   // 클래스 메서드 = 스태틱 메서드
  int mw() {return 0;}  // 인스턴스 메서드 = 논 스태틱 메서드
  
  //initializer block
  static {} //스태틱 블록
  {}    // 인스턴스 블록
  
  // constructor
  L() {}
  
  //nested class
  static class L1{} // static nested class
  class L2{} // non-static nested class = inner class
  
}
