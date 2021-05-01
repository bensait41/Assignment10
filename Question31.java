package Assignment10;

public class Question31 {

	public static void main(String[] args) {

		String s="Noon";
		
		System.out.println(isPalindrome(s));
		
	}
	
	public static boolean isPalindrome(String s) {
		
		s=s.toLowerCase();
		
		if(s.contains(" ")) {
			
			s=s.replace(" ", "");
		}
		
		String reversed="";
		
		for(int i=s.length()-1; i>=0; i-- ) {
		
			reversed += s.charAt(i);
			
		}
	
		
		if(s.equals(reversed)) {
			return true;
		}else {
			return false;
		}
		
	}

}
