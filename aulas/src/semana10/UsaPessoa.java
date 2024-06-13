package semana10;

public class UsaPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Ana", null);
		Pessoa p2 = new Pessoa(2, "Marcos", p1);
		p1.conjuge = p2;
		Pessoa p3 = new Pessoa(3, "Paulo", null);
		Pessoa p4 = new Pessoa(4, "Sofia", null);
		Pessoa p5 = new Pessoa(5, "Amélia", null);
		
		p4.conjuge = p3;
		p3.conjuge = p4;
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
		p4.mostrar();
		p5.mostrar();
	
	}
}
