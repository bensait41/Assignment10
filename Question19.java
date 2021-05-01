package Assignment10;

public class Question19 {

	public static void main(String[] args) {

		String sentence = "javaxjavaapplepearjavaegg";
		String word = "java";
		System.out.println(times(sentence, word));
		
	}
	
	public static int times(String sentence, String word) {
		
		sentence = sentence.toLowerCase();
		word =word.toLowerCase();
		
		int count=0;
		
		while(sentence.contains(word)) {
				sentence = sentence.replaceFirst(word, "");
				
				count++;
			}
			
		
		
		return count;
	}

}
