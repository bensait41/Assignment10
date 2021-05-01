package Assignment10;

public class Question25 {

	public static void main(String[] args) {

		String s1="ben";
		
		String s2="123456789";
		
		System.out.println(mergeStrings(s1,s2));
		
	}
	
	
	public static String mergeStrings(String s1, String s2) {
		
		String merge="";
		String rest;
		
		if(s1.length()>s2.length()) {
			
			for(int i=0; i<s2.length(); i++) {
				merge =merge + s1.charAt(i) + s2.charAt(i);
			}
			rest = s1.substring( s2.length() );
			
			merge = merge + rest;
			
		}else if(s2.length()>s1.length()) {
			
			for(int i=0; i<s1.length(); i++) {
				merge =merge + s1.charAt(i) + s2.charAt(i);
			}
			rest = s2.substring( s1.length() );
			
			merge = merge + rest;

		}else {
			for(int i=0; i<s1.length(); i++) {
				merge =merge + s1.charAt(i) + s2.charAt(i);
			}
		}
			
		return merge;
		
	}

}
