package SimplePrograms;

public class ConstructorTest {

	public static void main(String[] args) {

		Child c1 = new Child();
	}

}

class Parent1{
	
	Parent1(){
		System.out.println("In parent class Constructor");
	}
	
}

class Child extends Parent1{
	
	Child(){
		System.out.println("In Child Class Constructor");
	}
}
