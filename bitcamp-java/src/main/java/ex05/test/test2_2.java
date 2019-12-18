package ex05.test;

import java.util.Scanner; 

public class test2_2 {
public static void main(String[] args) {
  Scanner keyScan = new Scanner(System.in); 
  
  int[ ] no = new int[5];
  
  System.out.print("입력?");
  for(int i = 0; i < 5; i++) {
    no[i] = keyScan.nextInt();
  }
  no[0] = keyScan.nextInt();
  no[1] = keyScan.nextInt();
  no[2] = keyScan.nextInt();
  no[3] = keyScan.nextInt();
  no[4] = keyScan.nextInt();
  
  int min = no[0], max = no[0];
  
  for (int i = 1; i < 5; i++) {
  if(no[i] < min) {
    min = no[i];
  } else if(no[i] > max) {
    max = no[i];
  }
  }
  
  System.out.printf("최소값: %d\n", min);
  System.out.printf("최대값:%d\n", max);
 
  
keyScan.close();
}
}