package SimplePrograms;

public class TP {

	public static void main(String args[])
	{
		TP t = new TP();
		t.rec(5);
	}
	
	public void rec(int n)
	{
		if(n>0)
		{
			rec(n-1);
			System.out.print(n+" ");
		}
		return;
	}
}
