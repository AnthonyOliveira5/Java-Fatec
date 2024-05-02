package semana02;

public class For02 {

	public static void main(String[] args) throws InterruptedException {
		for(char letra = 'a'; letra <= 'z'; letra++) {
			System.out.println(letra + " = " + (int)letra);
			Thread.sleep(1000);
		}
	}
}
