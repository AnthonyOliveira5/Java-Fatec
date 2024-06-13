package semana12abstrata;

public abstract class Veiculo {
	
	public String placa, modelo, fabricante;
	
	public abstract void ligar();
	public abstract void desligar();
	public abstract void frear();
	public abstract void acelerar();
	
	public void gerarLog(Veiculo veiculo) {
		
		//enviar para arquivo .txt
		System.out.println(veiculo.toString());
		
	}
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", modelo=" + modelo + ", fabricante=" + fabricante + "]";
	}
	

}
