package operatorstask;

public class Logical {
	int age;
	boolean hasId;
	public void loginCheck() {
		
		System.out.println(" age = " + age + ", hasID = " + hasId);
		System.out.println(age>18 && hasId);
		System.out.println(age>18 || hasId);
		System.out.println(age>18 || !hasId);
		System.out.println(age>=18 && !hasId);
		System.out.println(age>=18 || !hasId);
		System.out.println(age>=18 || hasId);
		System.out.println(age<=18 || !hasId==hasId);
		System.out.println(age<18 || !hasId==hasId);

		
	}

	public static void main(String[] args) {
		Logical obj = new Logical();
		Logical obj1 = new Logical();
		obj.age=18;
		obj.hasId=true;
		obj1.age=22;
		obj1.hasId=false;
		obj.loginCheck();
		obj1.loginCheck();
		
	}

}
