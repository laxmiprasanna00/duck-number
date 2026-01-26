package operatorstask;

public class Compoundoperator {
	int score;
	int bonus;
	
	
	public void updateScore(int score, int bonus) {
		System.out.println("before score : "+score+"\n before bonus = "+bonus);
		System.out.println("using += operator : " +(score+=bonus));
		System.out.println("using -= operator : " +(score-=bonus));
		System.out.println("using *= operator : " +(bonus*=4));
		System.out.println("using /= operator : " +(score/=3));
		System.out.println("using %= operator : " +(score%=bonus));
		System.out.println("after score : "+score+"\n after bonus = "+bonus);

		
	}

	public static void main(String[] args) {
		Compoundoperator obj = new Compoundoperator();
		obj.updateScore(50, 7);

	}

}
