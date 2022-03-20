package week1.day1;

public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		System.out.println(num1);
		int num2 = 1;
		System.out.println(num2);
		for (int i=1; i<8; i++) {
			int sum = num1+num2;
			num1 = num2;
			num2 = sum;
			System.out.println(sum);
			
		}

	}

}
