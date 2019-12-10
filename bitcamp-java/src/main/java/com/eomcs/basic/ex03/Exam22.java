package com.eomcs.basic.ex03;
//정수리터럴 - _
public class Exam22{
  public static void main(String[] args){

//10진수 리터럴
System.out.println(2_3500_0000); //4자리 우리나라
System.out.println(235_000_000); //3자리 서양
System.out.println(23_5_00_00_00); //앞,뒤 넣으면 오류남

//8진수 표기법
System.out.println(01_44); // 한줄출력
System.out.println(0_144);
//System.out.println(0144)_;

//2진수 표기법
System.out.println(0b0110_0100); 
//System.out.println(0B_01100100); 
//System.out.println(0B01100100_); 
//System.out.println(_0b0110_0100); 

//16진수 표기법
System.out.println(0x00_64); 
//System.out.println(0x_0064);
//System.out.println(0x0064_); 
//System.out.println(_0x0064);  

  }
}