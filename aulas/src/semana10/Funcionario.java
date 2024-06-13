package semana10;

public class Funcionario {
	
	public int id;
	public String nome;
	public Cargo cargo;
	
	public void mostrar() {
		System.out.println("id: "+ id);
		System.out.println("nome: " + nome);
		System.out.println("cargo: "+cargo.nome);
	}
}
