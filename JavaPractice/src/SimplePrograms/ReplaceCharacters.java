package SimplePrograms;

public class ReplaceCharacters {

	public static void main(String[] args) {

		String s = "abcdefghij";
		
		for(int i=0; i < s.length();i++) {
			if(i%2!=0) {
				s=s.replace(s.charAt(i), 'z');
			}
			else {
				continue;
			}
		}
		System.out.println("New String is: "+s);
	}

}
