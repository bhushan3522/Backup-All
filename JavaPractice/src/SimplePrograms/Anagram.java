package SimplePrograms;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "bzad";
		Anagram a = new Anagram();
		if(a.checkAnagram(s1, s2)) {
			System.out.println("Given Strigs are anagram");
		}
		else
			System.out.println("Given Strings are not anagram");
	}
	
	public boolean checkAnagram(String a1, String a2) {
		Boolean flag;
		if(a1.length()==a2.length()) {
			char arr1[] = a1.toLowerCase().toCharArray();
			char arr2[] = a2.toLowerCase().toCharArray();
			
			for(int i =0; i < arr1.length-i;i++) {
				for(int j=0;j<arr1.length-1;j++) {
					if(arr1[j] > arr1[j+1]) {
						char temp = arr1[j];
						arr1[j] = arr1[j+1];
						arr1[j+1] = temp;
					}
				}
			}
			
			for(int i =0; i < arr2.length-i;i++) {
				for(int j=0;j<arr2.length-1;j++) {
					if(arr2[j] > arr2[j+1]) {
						char temp = arr2[j];
						arr2[j] = arr2[j+1];
						arr2[j+1] = temp;
					}
				}
			}
			
			if(new String(arr1).compareTo(new String(arr2))==0) {
				flag=true;
			}
			else
				flag = false;
		}
		else {
			flag=false;
		}
		return flag;
	}

}
