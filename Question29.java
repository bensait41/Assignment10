package Assignment10;

public class Question29 {

	public static void main(String[] args) {

		String string="abcd";
		int num=2;
		
		System.out.println(limit(string,num));
		
		
	}
	
	
	public static String limit(String string, int num) {
		
		return string.substring(0, num);
		
		
	}

}
