package Inheritance;

public class ChildClass1 extends ParentClass1 {
	int age =30;
	
	public static void main(String args[]) {
		ParentClass1 obj = new ChildClass1();
		ChildClass1 obj1 = new ChildClass1();
		System.out.println(obj.age);
		System.out.println(obj1.age);
	}
}
