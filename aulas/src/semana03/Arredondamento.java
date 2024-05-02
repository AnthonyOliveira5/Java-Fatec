package semana03;

public class Arredondamento {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			double n = Math.random()*100;
			System.out.print(n + " --> ");
			System.out.print(Math.ceil(n)+ " --> ");
			System.out.print(Math.floor(n)+ " --> ");
			System.out.println(Math.round(n));
		}

	}

}
