package StringOps;

public class WordReverse {

	public static void main(String[] args) {

		String s = "My name is Bhushan";
		String sArr[] = s.split(" ");
		String Reverse = "";
		
		for(int i=0; i<sArr.length;i++)
		{
			char ch[] = sArr[i].toCharArray();
			for(int j=ch.length-1; j>=0;j--)
			{
				Reverse = Reverse+ch[j];
			}
			Reverse = Reverse+" ";
		}
		
		System.out.println("Reversed String is : "+Reverse);
	}

}
