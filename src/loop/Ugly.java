package loop;

public class Ugly {
	public static boolean uglyNumber(int num) {
		while(num!=0){
			if(num%2==0) {
				num/=2;
			}
			else if (num%3==0) {
				num/=3;
			}
			else if(num%5==0) {
				num/=5;
			}
			else {
				break;
			}
		}return num==1;
	}

	public static void main(String[] args) {
		System.out.println(uglyNumber(30)?"Ugly number":"Not a Ugly Number");

	}

}
