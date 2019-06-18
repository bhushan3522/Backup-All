package firstPgm;

public class TestRTP1 {

	public static void main(String[] args) {
		Parent p = new Child();
		p.a();
	}

}

class Parent {
	private  void a()
	{
		System.out.println("This is parent class");
	}
}

class Child extends Parent{
	public  void a()
	{
		System.out.println("This is child class");
	}
}