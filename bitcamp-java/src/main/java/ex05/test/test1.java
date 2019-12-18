package ex05.test;

import java.util.Scanner; 

public class test1 {
public static void main(String[] args) {
// Scnner => shift.ctrl.o를 누르면 import를 설정할수 잇음
  Scanner keyScan = new Scanner(System.in); // system.in-데이터가 들어오가나 나가는것을 설정하라.
  
  
  System.out.print("입력? ");
 int no1 = keyScan.nextInt(); 
 int no2 = keyScan.nextInt();
 
System.out.printf("%d에서 %d까지의 합은 %d입니다.\n", no1, no2, 0);
  
keyScan.close();
}
}