package Assignment10;

public class Question18 {

	public static void main(String[] args) {

		System.out.println(wordSep("Word","X",1));
		
	}
	
	public static String wordSep(String s1, String s2, int count) {
		
		
		String output=s1;
		
		for(int i=1; i<count; i++) {
			
			output = output + s2 + s1; 
			
		}
		
		return output;
		
	}

}
