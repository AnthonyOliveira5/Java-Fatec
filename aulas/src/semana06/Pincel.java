package semana06;

public class Pincel {
	
	//atributos(propriedades)
	//estado do objeto
	//atributos definem o que o objeto é
	public String cor;
	public int comprimento;
	public double preco;
	public int carga;
	
	
	//métodos(operações)
	//comportamento do objeto
	//métodos define o que o objeto faz
	public void abrirTampa() {
		System.out.println("Abrindo a tampa...");
	}
	
	public void fecharTampa() {
		System.out.println("Abrindo a tampa...");
	}
	
	public void recarregar() {
		carga = 100;
		
	}
	
	public void mostrar() {
		System.out.println(cor);
		System.out.println(comprimento);
		System.out.println(preco);
		System.out.println(carga);
		
	}
}
