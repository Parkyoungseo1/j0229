package t4_exam;

import java.util.Scanner;

// 1개의 주사위를 던졌을때 나오는 숫자 맞추기 게임
public class Test4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su , rand, ans;
		
		while(true) {
			while(true) {
				System.out.print("주사위 눈금을 입력하세요? ");
				su = sc.nextInt();
				
				if (su >= 1 && su <= 6) break;
				System.out.println("1~6까지의 수를 입력하세요");
			}
			
			rand = (int)(Math.random() * 6) + 1;
			
			if(su == rand) System.out.println("정답!");
			else System.out.println("틀렸습니다. 출력된 주사위 눈금은 "+rand+ "입니다.");
			
			System.out.print("계속할까요?(1:계속/0:그만)");
			ans = sc.nextInt();
			
			if(ans == 0) break;
			System.out.println();
		}	
		System.out.println("작업 끝 ...");
			
		sc.close();
		
	}
}
