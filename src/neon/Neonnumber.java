package neon;

public class Neonnumber {
	
	public boolean getNum(int num) {
		int square=num*num;
		int sum=0;
		
		while(square!=0)
		{
			int rem = square%10;
			sum = sum+rem;
			
			square/=10;
		}
		return sum==num;
	}

	public static void main(String[] args) {
		Neonnumber obj=new Neonnumber();
		System.out.println(obj.getNum(9)?"neon number":"not a neon number");

	}

}
