package SimplePrograms;

public class MethodOvl {

	
	public int add(int x, int y)
	{
		return x+y;
	}
	
	private int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public int add(int p, int q, int r, int s)
	{
		return p+q+r+s;
	}
	
	public static void main(String[] args) {
		
		MethodOvl obj = new MethodOvl();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1, 1, 1, 1));
		System.out.println(obj.add(2, 2, 2));
	}

}
