package t4_exam;

import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		// 입력 받은 5단을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int dan;
		
		System.out.print("출력할 단을 입력하세요? ");
		dan = sc.nextInt();
		
		System.out.println(dan + "5단");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * "+i+" = " + (dan * i));
		}
		
		sc.close();
	}
}
