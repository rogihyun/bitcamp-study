package com.eomcs.basic.ex04;

public class Exam41{

  public static void main(String[] args) {
  // 문자 변수
  short s;
  char c;

  s = -32768;
  s = 32767;

  c = 0; // 같은 2바이트라도 음수가 안되고 정수만됨
  c = 65535;

  char c1 = 65;
  char c2 = 0x41;
  char c3 = 0b0100_0001;
  char c4 = 'A'; // 문자에 해당하는 유니코드값(ucs-2)저장 - 문자코드값 리턴


  System.out.println(c1);
  System.out.println(c2);
  System.out.println(c3);
  System.out.println(c4);
          
int i1 = 'A';
i1 = i1 + 10;
  System.out.println((char)i1);

  for (int i = 65; i < 'A' + 26; i++){
    System.out.print((char)i);
  }


  }
}