package t4_exam;

import java.util.Scanner;

// 숫자 맞추기 게임(1~100까지의 자연수)
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int rand = (int)(Math.random()*100) + 1;
		int cnt = 1, su;
		while(cnt <= 5) {
			System.out.print(cnt + ". 수를 입력하세요?(1~100) ");
			su = sc.nextInt();
			
			if(su == rand) {
				System.out.println("맞췄습니다!!!!");
				break;
			}
			else if(su > rand) System.out.println("더 작은수를 입력하세요! ");
			else System.out.println("더 큰수를 입력하세요! ");
			cnt++;
		}
		if(cnt == 6) System.out.println("정답은" + rand+ "였습니다. 아쉽지만, 다음기회에");
		
		sc.close();
	}
}
