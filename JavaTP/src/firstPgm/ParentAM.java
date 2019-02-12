package firstPgm;

public class ParentAM {

	public int publicInt = 2;
	protected int protectedInt = 3;
	private int privateInt = 4;
	
	
	public static void main(String[] args) {
		
		System.out.println("This is main");

	}
	
	public void setInt(int n)
	{
		privateInt = n;
	}
	
	public int getInt()
	{
		return privateInt;
	}

}
