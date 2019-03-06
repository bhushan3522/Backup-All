package ExceptionHandling;


public class TestTryCatch {

	
	public static void main(String[] args) throws Exception {

		int age = 10;
		if(age < 18)
			throw new Exception("Invalid age");
		else
			System.out.println("Go Ahead");
	}
}
