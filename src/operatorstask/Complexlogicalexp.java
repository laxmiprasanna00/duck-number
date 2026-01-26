package operatorstask;

public class Complexlogicalexp {
	int a,b,c;
	public void validate(int a, int b, int c) {
		System.out.println("a = "+a+"\n b = "+b+"\n c = "+c);
		System.out.println("first part "+(a > b && b < c));
		System.out.println("second part "+ !(a == c));
		System.out.println((a > b && b < c) || !(a == c));
	}

	public static void main(String[] args) {
		Complexlogicalexp obj1 = new Complexlogicalexp();
		Complexlogicalexp obj2 = new Complexlogicalexp();
		obj1.validate(10, 20, 30);
		obj2.validate(50, 25, 30);
		obj1.validate(10,8,4);

	}

}
