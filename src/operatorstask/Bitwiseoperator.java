package operatorstask;

public class Bitwiseoperator {
	int a=6;
	int b=3;
	public  void bitWise(){
		System.out.println("using & operator : " +(a&b));
		System.out.println("using | operator : " +(a|b));
		System.out.println("using ^ operator : " +(a^b));
		System.out.println("using ~ operator : " +(~b));
		System.out.println("using ~ operator : " +(~a));
		System.out.println("using >> operator : " +(a>>b));
		System.out.println("using << operator : " +(a<<b));
	}

	public static void main(String[] args) {
		
		Bitwiseoperator obj = new Bitwiseoperator();
		obj.bitWise();

	}

}

