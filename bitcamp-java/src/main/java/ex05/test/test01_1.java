package ex05.test;
import java.util.*;

public class test01_1 {
  public static void main(String[] args) {
  
System.out.print("입력?");

Scanner sc =new Scanner (System.in);

int a =sc.nextInt();
int b =sc.nextInt();

int sum = 0;
if(a > b){
  for(int i=b; i<=a; i++) {
    sum = sum + i;
  }
  System.out.printf("%d 에서 %d 까지 합은 %d 입니다.\n", b, a, sum);
}

if(b > a){
  for(int i=a; i<=b; i++) {
    sum = sum + i;
  }
  System.out.printf("%d 에서 %d 까지 합은 %d 입니다.\n", a, b, sum);
}

sc.close();
}
}