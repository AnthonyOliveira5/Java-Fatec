package semana10;

public class UsaCargo {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.id = 1;
		f1.nome = "Alex";
		
		f2.id = 2;
		f2.nome = "Sandra";
		
		Cargo c1 = new Cargo();
		
		c1.id = 1;
		c1.nome = "Analista";
		c1.tetoSalarial = 5000;
		c1.addFuncionario(f1);
		c1.addFuncionario(f2);
		
		c1.mostrar();
		
	}

}
