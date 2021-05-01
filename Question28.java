package Assignment10;

public class Question28 {

	public static void main(String[] args) {

		String string="one two three";
		String clean="two";
		
		System.out.println(clean(string,clean));
		
	}
	
	public static String clean(String string, String clean) {
		
		return string.replace(clean, "").replace("  ", " ");
	}

}
