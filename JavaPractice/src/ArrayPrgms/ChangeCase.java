package ArrayPrgms;

public class ChangeCase {

	public static void main(String[] args) {

		String s = "This is Bhushan, living in India";
		StringBuffer str = new StringBuffer(s);
		
		for(int i=0; i < s.length();i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				str.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
			else
				str.setCharAt(i, Character.toLowerCase(s.charAt(i)));
		}
		System.out.println("New String is");
		System.out.println(str);
	}

}
