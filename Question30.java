package Assignment10;

public class Question30 {

	public static void main(String[] args) {

		String string="longword";
		String add="foo";
		
		System.out.println(at3(string,add));	
	}
	
	
	public static String at3(String string, String add) {
		
		
		String rest=string.substring(3);
		
		String initial=string.substring(0,3);
		
		return initial+add+rest;
	}
	
	

}
