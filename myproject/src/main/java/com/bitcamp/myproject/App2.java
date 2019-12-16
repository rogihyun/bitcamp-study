package com.bitcamp.myproject;

import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
       
    String[] login = new String[100];
    String[] id = new String[100];
    String[] email= new String[100];
    String[] pw  = new String[100];
    String[] membership = new String[100];
       String response;
    
    int count = 0;
    for (int i =0; i < 5; i++) {  
            
      System.out.print("로그인:? ");
      login[i] = keyboard.nextLine();
  
                        
      System.out.print("아이디:? ");
      id[i] = keyboard.nextLine();
      
      System.out.print("이메일? ");
      email[i] = keyboard.nextLine();
    
      System.out.print("비밀번호? ");
      pw[i] = keyboard.nextLine();
      
      System.out.print("회원가입? ");
      membership[i] = keyboard.nextLine();
          
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
            login[i], id[i], email[i], pw[i], membership[i]);
      }
      
    }
  }