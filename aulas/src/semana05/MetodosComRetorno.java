package semana05;

public class MetodosComRetorno {
	
	public static int contarVogais(String frase) {
		int total = 0;
		//contar as vogais "Estudando POO"
		
		frase = frase.toLowerCase();
		
		for(int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') {
				total++;
			}
		}
		return total;
	}
	/**
	 * Método que recebe dois valores e retorna sua soma
	 * @param v1
	 * @param v2
	 * @return a soma dos valores
	 */
	
	
	
	public static int soma(double ...n) {//parametros opcionais
			
		int total = 0;
		for(int i = 0; i < n.length; i++) {
			total += n[i];
		}
		return total;
	}
	public static int soma(int[] n) {
		
		int total = 0;
		for(int i = 0; i < n.length; i++) {
			total += n[i];
		}
		return total;
	}
	
	public static int soma(int v1, int v2) {
		return v1+v2;
	}
	
	public static int soma(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}
	public static void contar(int limite){
		for(int i = 1; i <= limite; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}	
	}
	
	public static void main(String[] args) {
	
	 contar(10);
	 String s = "Estamos estudando programação";
	 System.out.println(contarVogais(s));
	 int soma = soma(1, 2);
	 System.out.println(soma);
	 System.out.println(MetodosComRetorno.soma(23, 34));	
	 System.out.println(soma(23, 34, 50));	
	 int[] vetor = {2,4,54,3,12,54,87,43,21,43,576,98,632,12,45,3,2,78};
	 System.out.println(soma(vetor));
	 System.out.println(soma(2,4,54,3,12,54,87,43,21,43,576,98,632,12,45,3,2,78));
	 
	}
}
