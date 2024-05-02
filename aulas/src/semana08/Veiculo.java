package semana08;

public class Veiculo {
	
	public String cor, marca;

	public Veiculo() {
		
	}
	public Veiculo(String cor, String marca) {
		this.cor = cor;
		this.marca = marca;
	}
	
	public void mostrar() {
		System.out.println(cor);
		System.out.println(marca);
		
	}
	
	
	
}
