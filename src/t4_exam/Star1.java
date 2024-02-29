package t4_exam;

/*
   1 2 3
   4 5 6
   7 8 9
*/
public class Star1 {
	public static void main(String[] args) {
		int su = 0;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				su++;
				System.out.print(su + " ");
			}
			System.out.println();
		}		
	}
}
