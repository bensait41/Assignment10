package Assignment10;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in); //dynamic programming
		
		System.out.println("Enter the string");
		String string=scan.nextLine();
		
		System.out.println("Enter the word");
		String word=scan.nextLine();
		
		scan.close();
		
		System.out.println(sandwich(string, word));
		
	}
	
	
	public static String sandwich(String string, String word) {
		
		if(string.indexOf( word , string.indexOf(word) + word.length()) == -1) {
			return "nothing";
		}else {
			return string.substring( string.indexOf(word) + word.length() , string.indexOf( word , string.indexOf(word) + word.length()  ) );
		}
		
		
		
		
		
	}

}
