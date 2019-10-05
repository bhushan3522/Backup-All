package SimplePrograms;

public class Const {

	int a,b;
	public Const() {

		System.out.println("Inside Constructor");
		a=10;
		b=20;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Const c = new Const();
		System.out.println("PRODUCT IS : "+c.a*c.b);
	}

}
