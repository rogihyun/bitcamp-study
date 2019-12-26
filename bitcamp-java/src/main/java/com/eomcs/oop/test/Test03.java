package com.eomcs.oop.test;
// gym 회원 정보를 입력 받아 출력 
public class Test03 {
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

  // 자바 원시 데이터 타입은 그냥 변수를 선언하는 순간 메모리도 준비된다.
  //변수가 곧 메모리이다.
  int i;
  
  i = 100; //ok
  // 그러나 래퍼런스는 메모리의 주소를 담는 변수다.
  // 래퍼런스를 선언했다고 해서 해당 설계도의 메모리가 준비도니ㅡㄴ 것은 아니다.
  member m1;
  
  // m1은 메모리의 주소를 저장하는 변수이다.
  // 주소를 저장하지 안혹 사용할 수없다.
  //m1.no = 100;
  
  //m1을 사용하려면 메모리(인스턴스)를 생성한 다음에 주소를 할당해야 한다.
  m1 = new member();
  
  m1.no = 100;
  
}
}
