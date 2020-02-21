// JDBC 드라이버 준비 - 드라이버 클래스 로딩과 등록
package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0130 {

  public static void main(String[] args) {

    // JDBC 드라이버 로딩 방법3: Driver 구현 클래스 로딩과 자동 등록
    // => java.sql.Driver 인터페이스를 구현한 클래스를 로딩하면
    // 해당 클래스에서 자신을 자동으로 DriverManager에게 등록할 것이다.
    // org.mariadb.jdbc.Driver 클래스의 소스를 확인해 보라!
    // static 블록에서 Driver 객체를 만들어 DriverManager에게 등록한다.
    //
    // => 이 방식의 장점은 소스 코드에 클래스를 지정하는 대신
    // 클래스 이름을 지정하기 때문에 실행할 때 다른 클래스로 쉽게 바꿀 수 있다.
    // => 따라서 특정한 Driver 구현체에 종속되지 않게 만들 수 있다.

    try {
      // 1) Class.forName("fullu-qualified class name(패키지명을 포함한 클래스명)")
      // => 문자열 파라미터로 주어진 클래스를 찾아 메모리(Metod Area)에 로딩한다.
      // => 이 과정에서 static {} 블록이 실행될 것이고,
      // 결국 Driver 인스턴스가 생성되어 DriverManger에게 등록될 것이다.
      // => 확인
      // 한 번 로딩된 클래스는 중복해서 로딩되지 않는다.
      // 따라서 static {} 블록도 중복해서 실행되지 않는다.
      // 그러니 Driver 인스턴스가 여러 개 생성될까 걱정하지 말라!
      // DriverManger에 같은 Driver 인스턴스가 여러 개 등록될까 걱정하지 말라!
      //
      Class.forName("org.mariadb.jdbc.Driver");

      // DriverManager에 자동 등록된 것을 확인해보자!
      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb:");
      System.out.println("JDBC 드라이버 로딩 및 등록 완료!");

    } catch (Exception e) {
      System.out.println("MariaDB의 java.sql.Driver 구현체를 등록하는 중에 오류 발생!");
      e.printStackTrace();
    }
  }
}


