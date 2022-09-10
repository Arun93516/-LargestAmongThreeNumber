package elbaT;

public class LargestAmongThreeNumber {

	public static void main(String[] args) {
		int a = 12;
		int b = 13;
		int c = 14;
		if (a >= b) {
			if (a >= c)
				System.out.println(a + " is the largest number.");
			else
				System.out.println(c + " is the largest number.");
		             } 
		
		else {
			if (b >= c)
				System.out.println(b + " is the largest number.");
			else
				System.out.println(c + " is the largest number.");
		}
	}
}
