package semana12;

public class Automovel implements Motor, Porta {

	@Override
	public void ligar() {
		System.out.println("Ligando o automóvel");
		Motor motor = new Aviao();
	}

	@Override
	public void desligar() {
		System.out.println("Desligando o automóvel");

	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando o automóvel");

	}

	@Override
	public void frear() {
		System.out.println("Freando o automóvel");

	}

	@Override
	public void abrir() {
		
	}

	@Override
	public void fechar() {
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

}
