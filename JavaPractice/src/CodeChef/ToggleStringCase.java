package CodeChef;

public class ToggleStringCase {

	public static void main(String[] args) {

		String s = "My Name is Bhushan";
		String newString="";
		for(int i=0; i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				newString=newString+Character.toUpperCase(s.charAt(i));
			}
			else
				newString =newString+Character.toLowerCase(s.charAt(i));
		}
		System.out.println(newString);
	}

}
