package Assignment10;

public class Question26 {

	public static void main(String[] args) {

		System.out.println(uniqueChars("java"));
		System.out.println(uniqueChars("mama"));
		System.out.println(uniqueChars("spoon"));
	}
	
	public static String uniqueChars(String str) { //remove duplicates

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			
			if (!result.contains("" + str.charAt(i))) {
				
				result += str.charAt(i);
			}
		}

		return result;
	}
		
	
	
	
	}


