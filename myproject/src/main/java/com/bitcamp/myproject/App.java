package com.bitcamp.myproject;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Scanner keyboard = new Scanner(System.in);
     
      String[] brandname = new String[100];
      String[] product = new String[100];
      String[] discount = new String[100];
      String[] additional  = new String[100];
      String[] size = new String[100];
      String[] code = new String[100];
      String[] delivery = new String[100];
      String response;
      
      int count = 0;
      for (int i =0; i < 5; i++) {  
                        
        System.out.print("상품명:? ");
        brandname[i] = keyboard.nextLine();
    
                          
        System.out.print("상품가격:? ");
        product[i] = keyboard.nextLine();
        
        System.out.print("상품할인? ");
        discount[i] = keyboard.nextLine();
      
        System.out.print("추가혜택? ");
        additional[i] = keyboard.nextLine();
        
        System.out.print("사이즈? ");
        size[i] = keyboard.nextLine();
        
        System.out.print("상품코드? ");
        code[i] = keyboard.nextLine();
        
        System.out.print("배송정보? ");
        delivery[i] = keyboard.nextLine();
              
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
           System.out.printf("%s, %s, %s, %s ,%s ,%s ,%s\n", 
            brandname[i], product[i], discount[i], additional[i], size[i], code[i], delivery[i]);
         }
         
         
       }
     }