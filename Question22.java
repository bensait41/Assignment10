package Assignment10;

public class Question22 {

	public static void main(String[] args) {

		String h="<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		
			html(h);
			
	}
	
	
	public static void html(String h) {
		
		if(h.contains("<html>") && h.contains("</html>")) {
			
			h=h.substring(h.indexOf("id"), h.indexOf( ">" , h.indexOf("id")));
			
			h=h.substring( h.indexOf("\"") + 1 , h.lastIndexOf("\"") );
			
			System.out.println(h);
			
		}else {
			
			System.out.println("Invalid Input!");
		}
		
	}

}
