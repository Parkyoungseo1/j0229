package t4_exam;

import java.util.Scanner;

// 최대값구하기 (Two Read)
public class Test5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max, min, su;
		
		System.out.print("수를 입력하세요? ");
		su = sc.nextInt();
		max = min = su;
		
		while(true) {
			System.out.print("수를 입력하세요?(종료시 999입력) ");
			su = sc.nextInt();
			
			if(su == 999) break;
			
			if(su > max) max = su;
			else if(su < min) min = su;
		}
		
		System.out.println("최대값 : " +max+ ", 최솟값 : " + min);
		
		sc.close();
	}
}
