package com.eomcs.oop.test;
// gym 회원 정보를 입력 받아 출력 
public class Test05 {
public static void main(String[] args) {

  // 회원정보를 담을 수 있는 메모리의 설계도
  class member{
    int no;
    String name;
    int birthYear;
    char gender;
    float height;
    float weight; 
    boolean personalTraining;
  }
  member m1;
  m1 = new member();
  m1.no = 100;
  System.out.println(m1);  // 인스턴스에 부여된 고유번화와 클래스명이 출력된다.
  System.out.println(m1.no); //
  
   member m2 = m1;
   // m2는  m1과 같은 주소를 갖고 있다. 즉 같은 인스턴스를 가리킨다.
   System.out.println(m2.no);
  
   
   // m1 인스턴스를 m2 인스턴스로 복사한게 아니다.
   m1.no =200;
   System.out.println(m2.no);
   
}
}
