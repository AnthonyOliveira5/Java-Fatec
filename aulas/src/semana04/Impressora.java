package semana04;

/**
 * Classe que simula uma impressora
 */

//baseado na classe impressora:

//1 - elabore  sua representação na UML
//2 - elabore uma aplicação em Java para testar as funcionalidades
//3 - Elabore ainda mais três métodos para a classe impressora e atualize
//a representação(1) e a aplicação(2)

/*
 * Sugestão de métodos:
 * 1. Imprimir em ordem inversa (espelho)
 * 2. Receber nomes de pessoas e imprimir uma pessoa em cada linha
 * 3. Receber uma frase e imprimir todas letras em maiúsculas ou
 * todas as letras em minúsculas
 * 4. Receber uma frase e imprimir a frase sem as vogais
 * 5. Receber uma frase e mostrar a quantidade de letras existentes
 */

public class Impressora {

	/**
	 * Recebe uma palavra e imprime uma letra de cada vez na
	 * orientação vertical
	 * @param palavra - A palavra a ser impressa em tela
	 */
	public static void imprimirVertical(String palavra) {
		for (int i = 0; i<palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
	}
	
	/**
	 * Recebe uma palavra e imprime ela inversamente
	 * @param palavra
	 */
	public static void imprimirInverso(String palavra) {
		for (int i = palavra.length()-1; i>=0; i--) {
			System.out.print(palavra.charAt(i));
		}
	}
	
	/**
	 * Recebe um texto e o imprime n vezes em tela
	 * @param texto
	 * @param quantidade
	 */
	public static void imprimirCopias(String texto, int quantidade) {
		for(int i = 0; i<quantidade; i++) {
			System.out.println(texto);
		}
	}
	
	public static void imprimirPessoas(String pessoa1, String pessoa2, String pessoa3, String pessoa4) {
		
		System.out.println("");
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		System.out.println(pessoa4);
	}
	
	
	public static void imprimirSemVogais(String palavra) {
		for (int i = palavra.length()-1; i>=0; i--) {
			System.out.print(palavra.charAt(i));
		}
	}
}
