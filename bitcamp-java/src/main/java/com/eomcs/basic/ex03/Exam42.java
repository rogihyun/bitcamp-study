package com.eomcs.basic.ex03;
//문자 리터럴 - 문자코드를 이용하여 문자출력
public class Exam42{
  public static void main(String[] args){
// 코드값을안다면직접코드값을사용하여문자를지정할수있다.
//그냥 숫자를 출력하면 정수를 표현한것으로 오해한다.

System.out.println(0x41); //앞에 00은 생략가능
System.out.println(0xac00); //

//숫자앞에 문자 코드임을 알리는 표시를 하라
//(char)0x0041
// 야 jvm! 이거 정수 아니다. 문자코드다.
//그러니 이 문자코드에 해당하는 문자를 
//폰트파일에서 찾아 그 코드에 해당하는 문자 그림을 출력해라
System.out.println((char)0x41); //앞에 00은 생략가능
System.out.println((char)0xac00); //

for (int i = 0; i < 11172; i++){
  if(i % 80 == 0)
  System.out.println();
  System.out.print((char)(0xac00 + i));
}

  }
}