package semana03;

public class Math03 {

	public static void main(String[] args) {
		
		for(int i = 1; i <=10; i++) {
			int n = (int)(Math.random()*10);
			System.out.print(n);
		}
		
		System.out.println();
		
		String senha = "";
		
		for(int i = 1; i <=10; i++) {
			senha += (int)(Math.random()*10);
			
		}
		System.out.print(senha);

	}

}
