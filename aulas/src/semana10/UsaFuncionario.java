package semana10;

public class UsaFuncionario {

	public static void main(String[] args) {
		
		Cargo c1 = new Cargo();
		
		c1.id = 1;
		c1.nome = "Analista";
		c1.tetoSalarial = 5000;
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.id = 1;
		f1.nome = "Alex";
		f1.cargo = c1;
		
		f2.id = 2;
		f2.nome = "Sandra";
		f2.cargo = c1;
		
		f1.mostrar();
		System.out.println();
		f2.mostrar();
	}

}
