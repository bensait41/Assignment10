package Assignment10;

public class Question27 {

	public static void main(String[] args) {

		String string="Certified Wooden Spoon";
		String cover="o";
		
		System.out.println(coverString(string,cover));
		
	}

	
	public static String coverString(String string, String cover) {
		
		String square="[" + cover + "]";
		
		string=string.replace( cover , square );
		
		return string;
		
	}
	
}
