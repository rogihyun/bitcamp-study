package com.eomcs.reflect.ex06.d;

import java.lang.reflect.Proxy;

// 값을 리턴하는 방법
public class Exam0110 {
  public static void main(String[] args) throws Exception {

    MyInterface obj = (MyInterface) Proxy.newProxyInstance(
        Exam0110.class.getClassLoader(),//
        new Class[] {MyInterface.class}, //
        new MyInvocationHandler());

  System.out.println(obj.m1(100, 200));
  System.out.println(obj.m2("홍길동", 30));

  }
}
