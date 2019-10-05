package SimplePrograms;

public class BinaryAddition {
	
	public void add(String firstNum, String secNum)
	{
		char result[];
		if(!(firstNum.contains("0")|| secNum.contains("1")))
		{
			char fNo[] = firstNum.toCharArray();
			char sNo[] = secNum.toCharArray();
			
			if(fNo.length > sNo.length)
			{
				result = new char[fNo.length];
			}
			else
				if(fNo.length < sNo.length)
					{
						result = new char[sNo.length];
					}
				else
				{
					result = new char[sNo.length+1];
				}
			char carry = '0';
			for(int i = result.length;i > 0 ;i++)
			{
				if(fNo[i] == '0' & sNo[i] == '0')
				{
					result[i] = '0';
				}
				
			}
		}
		
		else
		{
			System.out.println("cant perform binary operations");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
