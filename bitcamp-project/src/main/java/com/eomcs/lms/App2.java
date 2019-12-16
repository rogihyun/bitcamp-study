package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    int[] no = new int[100];
    String[] name = new String[100];
    String[] email = new String[100];
    String[] pw = new String[100];
    String[] photo = new String[100];
    String[] t = new String[100];
    String[] join = new String[100];
    String response;
    
    int count = 0;
    for (int i =0; i < 5; i++) {  
            
    System.out.print("번호:? ");
    no[i] = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.print("이름: ");
    name[i] = keyboard.nextLine();
    
    System.out.print("이메일: ");
    email[i] = keyboard.nextLine();
    
    System.out.print("암호: ");
    pw[i] = keyboard.nextLine();
    
    System.out.print("사진: ");
    photo[i] = keyboard.nextLine();
    
    System.out.print("전화: ");
    t[i] = keyboard.nextLine();
    
    System.out.print("가입일: ");
    join[i] = keyboard.next();
    
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
        System.out.printf("%d, %s, %s, %s ,%s ,%s ,%s \n", 
           no[i], name[i], email[i], pw[i], photo[i], t[i], join[i]);
      }
      
    }
  }