package Assignment10;

public class Question20 {

	public static void main(String[] args) {

		factorial(5);
		
	}

	
	public static void factorial(int n) {

		for(int i=n; i>1; i--) {
			
			n = n * (i-1);
			
		}
		
		System.out.println(n);
	}
}
