package semana04;

public class Metodos {

	public static void imprimir() {

		System.out.println("Apostila de Java");
	}
	public static void imprimirFrase(String frase ) {
		System.out.println(frase);
	}

	public static void imprimirConcatenado(String s1, String s2) {
		System.out.println(s1+s2);

	}

}

//public private - modificador de acesso
// o nome do método "imprimir" define quem o método é
//método pode ser sem retorno, ou com retorno
//método void significa sem retorno
//o bloco de instruções dentro do método é o corpo/implementação
//o método "imprimir" é consideração uma declaração
// no lugar do void pode ser colocado o tipo de retorno - int string double etc
//o método com retorno pode ser considerado uma função
//procedures é quando está sem retorno, e funções com retorno
//o método faz ambos, pode ser com ou sem retorno
//qual a diferença entre método e função? 
//a função pode ser considerada como funcionalidades genéricas
//já o método, são funcionalidades associadas a um objeto
//Método static pode ser considerado uma função 
//variavel só existe enquanto o método estiver sendo executado - no caso,
//o parametro passado ao método o que está entre parenteses
//Orientação a objetos são os objetos trocando mensagens!
//desta forma, os métodos podem ser considerados mensagens - representação


