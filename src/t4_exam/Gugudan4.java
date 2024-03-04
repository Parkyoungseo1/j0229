package t4_exam;

import java.util.Scanner;

public class Gugudan4 {
	public static void main(String[] args) {
		// 시작단에서 끝단까지 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int startDan, endDan;
		
		System.out.print("시작단을 입력하세요? ");
		startDan = sc.nextInt();
		System.out.print("끝단을 입력하세요? ");
		endDan = sc.nextInt();
		
		for(int i=startDan; i<=endDan; i++) {
			System.out.println(i + "단");
			for(int j=1; j<=9; j++) {
			System.out.println(i + " * " +j+ " = " + (i * j));
			}
			System.out.println();		
		}
		
		sc.close();
	}
}
