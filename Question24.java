package Assignment10;

public class Question24 {

	public static void main(String[] args) {

		String input="We study java not phyton";
		String s1="java";
		String s2="phyton";
		
		
		System.out.println(appearances(input, s1,s2));
		
		
	}
	
	public static boolean appearances(String input, String s1, String s2) {
		
		int count1=0;
		String temp1=input;
		
		while(temp1.contains(s1)) {
			
			temp1 = temp1.replaceFirst(s1, "");
			count1++;
		}
		
		int count2=0;
		String temp2=input;
		
		while(temp2.contains(s2)) {
			
			temp2 = temp2.replaceFirst(s2, "");
			count2++;
		}
		
			if(count1==count2) {
				return true;
			}else {
				return false;
			}
		
		
	}

}
