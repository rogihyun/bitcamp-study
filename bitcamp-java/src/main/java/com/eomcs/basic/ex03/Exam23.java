package com.eomcs.basic.ex03;

public class Exam23{
  public static void main(String[] args){

//리터럴 : 4바이트[기본],8바이트    
//리터럴에 아무런 표시를 안하면 기본이4바이트 정수를 의미한다.
System.out.println(0x00_64); //jvm에서 4바이트메모리에 저장
System.out.println(-2147483648); // - 2**31 4바이트 최소음수값
System.out.println(-2147483647); // - 2**31 -1 4바이트 최대양수

//System.out.println(-2147483649); //4바이트 메모리 크기초과
//System.out.println(-2147483648); //4바이트 메모리 크기초과

//8바이트 64비트  정수 리터럴
// 숫자뒤에 접미사 L,1을 붙인다.
System.out.println(-9_223_372_036_854_775_808L);
System.out.println(-9_223_372_036_854_775_808l);
System.out.println(-9_223_372_036_854_775_807l);
System.out.println(-9_223_372_036_854_775_807l);

System.out.println(100); // 4바이트 정수리터럴
System.out.println(100L); // 8바이트 정수리터럴

System.out.println(Integer.MIN_VALUE); //4바이트 최소정수값
System.out.println(Integer.MAX_VALUE); //4바이트 최대정수값
System.out.println(Long.MIN_VALUE); //4바이트 최소정수값
System.out.println(Long.MAX_VALUE); //4바이트 최대정수값

  }
}