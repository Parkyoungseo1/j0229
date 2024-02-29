package t2_do_while;

/*
  do{
   	수행할 내용
  } while(조건식);
 */
public class Test1 {
	public static void main(String[] args) {
		int i = 0;
		
		do {
			i++;
			System.out.println(i);
		} while(i < 10);
	}
}
