package t4_exam;

import java.util.Scanner;

// 최대값구하기 (초기값 지정방식)
public class Test5_2 {
	public static void main(String[] args) {
		// 단, 2자리 이하의 정수만을 입력받는다.
		Scanner sc = new Scanner(System.in);
		int max=-99, min=99, su;
				
		while(true) {
			System.out.print("수를 입력하세요?(종료시 999입력) ");
			su = sc.nextInt();
			
			if(su == 999) break;
			
			if(su > max) max = su;
			if(su < min) min = su;
		}
		
		System.out.println("최대값 : " +max+ ", 최솟값 : " + min);
		
		sc.close();
	}
}
