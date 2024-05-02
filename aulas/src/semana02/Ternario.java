package semana02;

public class Ternario {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		//versão 1
		if(a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		//versão 2
		int m = a>b?a:b;
		System.out.println(m);
		
		//versão 3
		System.out.println(a>b?a:b);
		System.out.println(a>b?a:b>a?b:"iguais");
	}

}
