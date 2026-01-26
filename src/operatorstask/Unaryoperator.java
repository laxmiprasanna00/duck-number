package operatorstask;

public class Unaryoperator {
	int x;
	int y;
	public void calculate(int x,int y) {
		System.out.println("sum = "+(x+y));
		System.out.println("difference = "+(x-y));
		System.out.println(" multiplication = "+(x*y));
		System.out.println("division = "+(x/y));
		System.out.println("modulus = "+(x%y));
		System.out.println("post increment = "+(x++ +  y++));
		System.out.println("x value after "+x);
		System.out.println("pre increment = "+ ++x);
		System.out.println("post decrement = "+(x-- +  x-- + y--));
		System.out.println("pre decrement = "+ --x);
		System.out.println("pre increment = "+ (x=(++x +(--x +y)+y++ + ++y+y)));
		System.out.println("y value after "+y);
		System.out.println("x value after "+x);

	}

	public static void main(String[] args) {
		
		Unaryoperator obj=new Unaryoperator();
		obj.calculate(5, 7);
		

	}

}
