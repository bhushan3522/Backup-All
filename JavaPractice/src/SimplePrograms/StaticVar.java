package SimplePrograms;

public class StaticVar {
	int a;

	public static void main(String[] args) {

		StaticVar s = new StaticVar();
		s.a();
		s.b();
		s.c();
	}

	public void a() {
		a=10;
		System.out.println(a);
	}
	public void b() {
		System.out.println(a);
	}
	public void c() {
		System.out.println(a);
	}
}
