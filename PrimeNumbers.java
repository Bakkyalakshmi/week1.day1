package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for(int i=2;i<=input/2;i++) 
		{
			int remind = input%i;
			if(remind==0) 
			{
				flag=true;
				break;
			}
		}
		if(flag==false) 
		{
			System.out.println(input + "is a prime number");
		}
		else 
		{
			System.out.println(input + "not a prime number");
		}
	}

}


