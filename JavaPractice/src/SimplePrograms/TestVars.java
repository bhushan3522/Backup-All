package SimplePrograms;

public class TestVars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestVars t = new TestVars();
		t.a();

	}
	
	public void a() {
		int i = 10;
		b(i);
		System.out.println(i);
	}
	
	public void b(int i) {
		i++;
		System.out.println(i);
	}

}
