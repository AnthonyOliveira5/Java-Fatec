package semana02;

public class For03 {

	public static void main(String[] args) {
		int[] v = {3,5,6,3,67,32,564,2,5,64,43,6,68,8,32,2556,6,4323};
		
		int tamanho = v.length; //atributo - retorna quantos elementos existem em um array
		
		String s = "Anthony";
		int t = s.length(); // Método - retorna a quantidade de caracteres existentes - 7
		
		//percorre todos os elementos do vetor
		for(int i = 0; i < tamanho; i++) {
			System.out.println(i + " = " + v[i]);
		}
		
		//percorre os elementos usando o iterator
		for(int x:v) {
			System.out.println(x);
		}
		
	}

}
