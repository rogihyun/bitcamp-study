package com.eomcs.basic.ex03;
//문자 리터럴
public class Exam41{
  public static void main(String[] args){
// 직접문자를 작성할수있다.
//'문자'
System.out.println('A'); 
System.out.println('가');

// 코드값으로 문자를 지정할 수 있다.
//[\ u] [ucs-2 코드]
System.out.println('\u4eba'); 
System.out.println('\u0041'); // a문자
System.out.println('\u0030'); // 0문자
System.out.println('\u0025'); // %문자
System.out.println('\uac00'); // 가문자


  }
}