// dynamic sql 다루기 - <Set> 사용 전 문제점
package com.eomcs.mybatis.ex03;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam0220 {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = Resources.getResourceAsStream(//
        "com/eomcs/mybatis/ex03/mybatis-config.xml");
    SqlSessionFactory factory = //
        new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession sqlSession = factory.openSession();

    // 실행 예:
    // => 게시글 변경하기
    // => 제목만 바꿀 경우, 내용만 바꿀 경우, 둘 다 바꿀 경우에 대해
    //    각각의 update SQL을 준비한다.

    HashMap<String,Object> params = new HashMap<>();

    Scanner keyScan = new Scanner(System.in);

    System.out.print("제목 ");
    String value = keyScan.nextLine();
    if(value.length() > 0) {
      params.put("title", value);
    }

    System.out.print("내용? ");
    String keyword = keyScan.nextLine();
    if(value.length() > 0) {
      params.put("content", value);
    }

    keyScan.close();

    params.put("no", 1); // 1번게시글

    int count =0;
    if(params.get("title") != null && params.get("content") != null) {
       count = sqlSession.update("BoardMapper.update3", params);
    }else  if(params.get("title") != null) {
      count = sqlSession.update("BoardMapper.update1", params);
    }else  if(params.get("content") != null) {
      count = sqlSession.update("BoardMapper.update2", params);
    }
    System.out.println(count);


    List<Board> list = sqlSession.selectList("BoardMapper.select21", //
        params);

    // 실무
    // => 특정 컬럼의 값만 바꾸기 위해 여러개의 SQL을 만드는 것은 번거롭다.
    // => 그래서 전체 컬럼의 값을 바꾸는 방식을 주로 사용한다.
    // => 문제점? 바꾸지 않아도 될 항목까지 변경하기 때문에 성능이 떨어진다.
    // =>
    sqlSession.commit();
    sqlSession.close();
  }

}


