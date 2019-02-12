package firstPgm;

public class Kid extends Person{
	
	public void whereAmI()
	{
		System.out.println("Kid(WhereAmI)");
	}
	
	public void whoAmI()
	{
		who();
		System.out.println("Kid(whoAmI)");
	}

}
