package Assignment10;

public class Question21 {

	public static void main(String[] args) {

		appearance("abXYabc" , 3);
		
	}
	
	public static void appearance(String sentence, int n) {
		
		String word="";
		for(int i=0; i<n; i++) {
		
			word = word + sentence.charAt(i);
			
		}
		
		int count=0;
		while(sentence.contains(word)) {
			
			sentence = sentence.replaceFirst(word, "");
			count++;
		}
		
		if(count<2) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
		
		System.out.println(word + " appears " + count + " times");
			
	}

}
