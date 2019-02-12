package testPkg;

import firstPgm.ParentAM;

public class TestAM extends ParentAM {
	
	public void a()
	{
		protectedInt = 10;
		System.out.println(protectedInt);
	}

}
