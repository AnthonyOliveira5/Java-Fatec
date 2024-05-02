package semana03;

public class Math02 {

	public static void main(String[] args) {

		int cartao = 1;
		while (cartao <= 10) {
			System.out.print("Cartão "+ cartao+ ": ");
			for(int a = 1; a<=6;a++) {
				System.out.print(1+(int)(Math.random()*60)+ " "); //pseudo aleatório
			}
			System.out.println();
			cartao++;
		}
		
	}
}
