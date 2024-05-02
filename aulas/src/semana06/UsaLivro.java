package semana06;

public class UsaLivro {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		livro1.digitar();
		System.out.println(livro1);
		
		
		Livro livro2 = new Livro("Poeira em alto mar");
		Livro livro3 = new Livro(123, "Titulo", 100);
		
		livro1.mostrar();
		livro2.mostrar();
		livro3.mostrar();
		System.out.println(livro3);

	}

}
