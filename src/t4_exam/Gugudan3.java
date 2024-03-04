package t4_exam;

public class Gugudan3 {
	public static void main(String[] args) {
		// 2단에서 5단까지 출력하시오.
		
		for(int i=2; i<=5; i++) {
			System.out.println(i + "단");
			for(int j=1; j<=9; j++) {
			System.out.println(i + " * " +j+ " = " + (i * j));
			}
			System.out.println();		
		}
	}
}
