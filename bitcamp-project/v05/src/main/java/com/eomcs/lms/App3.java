package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("번호?: ");
      int no = keyboard.nextInt();
      keyboard.nextLine();
      
    System.out.print("내용?: ");
   String title = keyboard.nextLine();
   
    //현재일시
   //currentTimeMillis -()
   // => 1970년 1월 1일 0시 0분 0초부터 현재까지 경과된 시간을
   // 밀리초로 리턴한다.
   //new Date(밀리초) 
   //=> 넘겨 받은 밀리초를 가지고 년,월,일,시,분,초를 계산한다.
   Date today = new Date(System.currentTimeMillis());
    int count = 0;
   
   keyboard.close();
   
   System.out.println();
    
    System.out.print("번호:%d\n ");
    
    System.out.print("내용:%d\n ");
   
    System.out.print("작성일:%s ");
   
    System.out.print("조회수:%d ");
   
  } 
}
