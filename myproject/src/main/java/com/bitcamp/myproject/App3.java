package com.bitcamp.myproject;

import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
       
    String[] order = new String[100];
    String[] cancel = new String[100];
    String[] review= new String[100];
    String[] coupon = new String[100];
    String[] advice = new String[100];
       String response;
    
    int count = 0;
    for (int i =0; i < 5; i++) {  
            
      System.out.print("주문배송:? ");
      order[i] = keyboard.nextLine();
  
                        
      System.out.print("취소교환반품:? ");
      cancel[i] = keyboard.nextLine();
      
      System.out.print("상품리뷰? ");
      review[i] = keyboard.nextLine();
    
      System.out.print("쿠폰? ");
      coupon[i] = keyboard.nextLine();
      
      System.out.print("상담내역? ");
      advice[i] = keyboard.nextLine();
          
    count++; 
    
    System.out.println();
    
    System.out.print("계속 입력하시겠습니까?(Y/n) ");
    response = keyboard.next();
    if(!response.equalsIgnoreCase("y")) {
      break;
    }
   }
     
    keyboard.close();
    
      System.out.println();
      
      for (int i = 0; i < count; i++) {
        System.out.printf("%s, %s, %s, %s ,%s \n", 
            order[i], cancel[i], review[i], coupon[i], advice[i]);
      }
      
    }
  }