// 흐름 제어문 - break와 continue
package ex06;

import java.util.Scanner;

public class Exam03_2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        // 1부터 100까지의 합은?
        while (count < 100) {
            count++;
            sum += count;
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------");

       
        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------");

        // break 사용 전 
        // 0부터 99까지의 카운트를 하는데 단 합은 50까지만 계산한다.
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count > 50) // 50을 넘어가면 합을 수행하지 않지만 100까지 계속반본한다.
                continue;
            sum += count;
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------");

        // break 사용 후 
        // 0부터 99까지의 카운트를 하는데 단 합은 50까지만 계산한다.
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count > 50)  
                break; // 즉시 반복문을 종료하고 나간다.
            sum += count;
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

    }
}
