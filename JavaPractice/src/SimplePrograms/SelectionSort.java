package SimplePrograms;

public class SelectionSort {

	public static void main(String[] args) {
		int unsortedArr[] = {5,1,12,-5,16,2,12,14};
		SelectionSort ss = new SelectionSort();
		int sortedArr[] = ss.sortArray(unsortedArr);
		for(int i=0;i<sortedArr.length;i++) {
			System.out.print(sortedArr[i]);
			System.out.print(" ");
		}
	}
	public int[] sortArray(int a[]) {
		for(int i =0; i <a.length;i++)
		{
			int lowestIndex=getLowest(i, a); 
			int temp = a[i];
			a[i] = a[lowestIndex];
			a[lowestIndex] = temp;
		}
		return a;
	}
	public int getLowest(int n,int a[]) {
		int lowest = a[n];
		int index=n;
		for(int i =n; i < a.length;i++)
		{
			if(lowest > a[i])
			{
				lowest=a[i];
				index = i;
			}
		}
		return index;
	}
}
