package semana10;

public class Pessoa {
	
	public int cpf;
	public String nome;
	public Pessoa conjuge;
	
	public Pessoa() {
	}

	public Pessoa(int cpf, String nome, Pessoa conjuge) {
		this.cpf = cpf;
		this.nome = nome;
		this.conjuge = conjuge;
	}
	
	public void mostrar() {
		System.out.println(cpf);
		System.out.println(nome);
		if(conjuge!=null) {
			System.out.println("Casado com: " + conjuge.nome);
		} else {
			System.out.println("Solteiro");
		}
	}
	
}
