package com.bitcamp.myproject;

public class App {

  public static void main(String[] args) {
    System.out.println("상품명: " + 1); // 문자열 리터럴과 숫자 리터럴 합치기
    System.out.println("상품코드: 제품코드"); // 문자열 리터럴 출력
    System.out.println("할인카드: " + "신용카드"); // 문자열 연결
    System.out.print("배송시작일: "); // 줄바꿈 없이 출력
    System.out.println("2019-01-02");
    System.out.print("배송종료일: ");
    System.out.print("2019-01-02\n"); // 문자열 속에 줄바꿈 명령 넣기
    System.out.print("가격: ");
    System.out.print(1000);
    System.out.print(" 사이즈");
    System.out.println(); // 아규먼트 없이 호출하면 줄바꿈 명령만 실행
    System.out.printf("결제: %d 결제완료\n", 8); // 문자열의 형식을 정의해 두고 값을 넣어 출력하기
  }
}
