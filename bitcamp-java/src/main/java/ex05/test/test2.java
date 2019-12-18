package ex05.test;

import java.util.Scanner; 

public class test2 {
public static void main(String[] args) {

  Scanner keyScan = new Scanner(System.in); 
  
  System.out.print("입력?");
  int no1 = keyScan.nextInt();
  int no2 = keyScan.nextInt();
  int no3 = keyScan.nextInt();
  int no4 = keyScan.nextInt();
  int no5 = keyScan.nextInt();
  
  System.out.printf("%d, %d, %d, %d, %d,\n", no1, no2, no3, no4, no5);
  int min = no1, max = no1;
  
  if(no1 < min) {
    min = no1;
  } else if(no1 > max) {
    max = no1;
  }
  
  if(no2 < min) {
    min = no2;
  } else if(no2 > max) {
    max = no2;
  }
  
  if(no3 < min) {
    min = no3;
  } else if(no3 > max) {
    max = no3;
  }
  
  if(no4 < min) {
    min = no4;
  } else if(no4 > max) {
    max = no4;
  }
  
  if(no5 < min) {
    min = no5;
  } else if(no5 > max) {
    max = no5;
  }
  
  
  System.out.printf("최소값: %d\n", min);
  System.out.printf("최대값:%d\n", max);
 
  
keyScan.close();
}
}