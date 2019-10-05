package SimplePrograms;

public class ReverseSent {

	public static void main(String[] args) {

		
		String s = "My name is Bhushan";
		
		String sArr[] = s.split(" ");
		String ans = "";
		for(int i=sArr.length-1 ; i >=0 ; i--)
		{
			//System.out.print(sArr[i]);
			ans = ans+sArr[i]+" ";
			//System.out.println(ans);
		}
		
		System.out.println("New String is : "+ ans);
	}

}
