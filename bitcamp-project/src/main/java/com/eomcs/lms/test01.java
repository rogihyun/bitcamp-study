package com.eomcs.lms;
//과제 1 : 계산기 애플리케이션을 작성하라.
//- 실행
//값1? 10
//값2? 20
//연산자(+,-,*,/)? +
//=> 10 + 20 = 30 

import java.util.Scanner;

public class test01 {
  public static void main(String[] args) {
     
    Scanner test = new Scanner(System.in);// 시스템 -스캐너 입력받고 키보드변수에들어간다.
    
    System.out.print("값1:? ");
    int test1 = test.nextInt();
    
    
    System.out.print("값2:? ");
    int test2 = test.nextInt();
    
    System.out.print("연산자(+,-,*,)?");
    String test3 = test.next();
    
    int test01 = 1;

    switch(test3){
        case "+" : 
            System.out.println(test1 + test2);
            break;
        case "-" :
            System.out.println(test1 - test2);
            break;
        case "*" :
            System.out.println(test1 * test2);
            break;
        case "/" :
          System.out.println(test1 / test2);
          break;
          
        default :
            System.out.println("0");
            
            
    }
    
    
    
    
    
    
    
    
    
    
}
}
