package semana08;

public class Automovel extends Veiculo{
	
	public String placa;
	
	public Automovel() {
	}
	
	public Automovel(String cor, String marca, String placa) {
		super(cor, marca);
		this.placa = placa;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println(placa);
	}

}
