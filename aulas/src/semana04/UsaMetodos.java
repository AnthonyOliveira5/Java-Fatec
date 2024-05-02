package semana04;

public class UsaMetodos {

	public static void main(String[] args) {

		Metodos.imprimir();
		Metodos.imprimirFrase("Aprendendo métodos");
		Metodos.imprimirFrase("Oi!");
		Metodos.imprimirConcatenado("Oi ", "Pessoal");

	}
}

//assinatura errada, erro - o método espera um parametro e não recebeu
//argumento é o que enviamos para o parametro
//quando envio eu chamo de argumento, quando recebo é chamado de parametro
