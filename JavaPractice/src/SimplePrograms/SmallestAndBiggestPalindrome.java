package SimplePrograms;

public class SmallestAndBiggestPalindrome {
	
	public static void main(String args[]) {
		
		String s = "Wow you own nn kayak aaabbaaa";
		SmallestAndBiggestPalindrome obj = new SmallestAndBiggestPalindrome();
		obj.checkPalindrome(s);
		
	}
	
	public void checkPalindrome(String x) {
		String xArr[] = x.split(" ");
		int smallest = xArr[0].length();
		int smallestIndex=0;
		int biggest = xArr[0].length();
		int biggestIndex=0;
		String reverseArray[] = new String[xArr.length];
		for(int i =0 ; i < xArr.length;i++) {
			String reversed = "";
			for(int j=xArr[i].length()-1; j>=0;j--) {
				reversed=reversed+xArr[i].charAt(j);
			}
			if(xArr[i].equalsIgnoreCase(reversed)) {
				reverseArray[i] = xArr[i];
			}
			else {
				reverseArray[i] = "-1";
			}
		}
		
		for(int i=0; i < reverseArray.length;i++) {
			if(reverseArray[i]!="-1") {
				if(reverseArray[i].length() < smallest) {
					smallest = reverseArray[i].length();
					smallestIndex = i;
				}
				if(reverseArray[i].length() > biggest) {
					biggest = reverseArray[i].length();
					biggestIndex = i;
				}
			}
		}
		System.out.println("Smallest Palindrome word is : "+reverseArray[smallestIndex]);
		System.out.println("Biggest Palindrome word is : "+reverseArray[biggestIndex]);
	}

}
