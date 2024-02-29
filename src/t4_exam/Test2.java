package t4_exam;

public class Test2 {
	public static void main(String[] args) {
		int lotto;
		String str = "";
		
		for(int i=1; i<=6; i++) {
			lotto = (int)(Math.random()*45) + 1;
			str += lotto + " / "; // str = str + lotto;
		}
		System.out.println("금주의 로또 번호는? " + str);
	}
}
