package StringOps;

public class StrCompare {

	public static void main(String[] args) {

		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Rachin";
		String s5 = "sacHIN";
		
		//using equals method
		System.out.println("======================Using equals method==========================");
		System.out.println("comparing "+s1+ " and "+ s2 + " ====> " +s1.equals(s2));
		System.out.println("comparing "+s1+ " and "+ s3 + " ====> " +s1.equals(s3));
		System.out.println("comparing "+s1+ " and "+ s5 + " ====> " +s1.equals(s5));
		System.out.println("comparing "+s1+ " and "+ s5 + " ====> " +s1.equalsIgnoreCase(s5));
		
		//using == operator
		System.out.println("======================Using == Operator============================");
		System.out.println("comparing "+s1+ " and "+ s2 + " ====> " + (s1 == s2));
		System.out.println("comparing "+s1+ " and "+ s5 + " ====> " + (s1 == s5));
		System.out.println("comparing "+s1+ " and "+ s3 + " ====> " + (s1 == s3));
		
		//using compareTo method
		System.out.println("======================Using compareTo Method======================");
		System.out.println("comparing "+s1+ " and "+ s2 + " ====> " +s1.compareTo(s2));
		System.out.println("comparing "+s1+ " and "+ s3 + " ====> " +s1.compareTo(s3));
		System.out.println("comparing "+s1+ " and "+ s4 + " ====> " +s1.compareTo(s4));
		System.out.println("comparing "+s4+ " and "+ s1 + " ====> " +s4.compareTo(s1));
	}

}
