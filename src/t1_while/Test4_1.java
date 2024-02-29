package t1_while;

//반복문 제어
public class Test4_1 {
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {
			i++;
			//i값이 짝수인 경우만 출력하시오
			if(i % 2 == 0) System.out.println(i);
		}
	}
}
