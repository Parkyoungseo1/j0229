package t4_exam;

// 4x + 5y =60을 만족하는 x , y 값을 출력하시오
public class exam5 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int x = 0; x <= 10; x++) {
			for(int y=0; y<= 10; y++) {
				if((4*x + 5*y) == 60) {
					System.out.println("(x="+x+", y=" +y+ ")");
					cnt++;
				}
			}
		}
		System.out.println("조건을 만족하는 개수는 ? " + cnt);
	}
}
