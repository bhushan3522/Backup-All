package firstPgm;

public class TestInheritance1 {

	public static void main(String[] args) {

		ChildClass1 cc = new ChildClass1(25, 25000);

	}

}

class BaseClass1{
	int a = 5;

	public BaseClass1()
	{
		System.out.println("This is Super Class CONST");
	}
}

class ChildClass1 extends BaseClass1{
	
	public ChildClass1(int age, int salary)
	{
		System.out.println("Age is "+age+"Salary is "+salary+""+a);
	}
}
