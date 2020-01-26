package SimplePrograms;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "My name is Bhushan";
		String sArr[] = s.split(" ");
		String temp = "";
		
		for(int i = 0; i < sArr.length;i++)
		{
			for(int j = sArr[i].length()-1; j >= 0; j--)
			{
				temp = temp + sArr[i].charAt(j);
			}
			temp = temp+" ";
		}
		System.out.println(temp);

	}

}
