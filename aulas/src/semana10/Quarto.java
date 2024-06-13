package semana10;

public class Quarto {
	
	public String cor;
	public Lampada lampada;
	
	public Quarto() { //representação de uma Composição - Ao criar o objeto Sala, uma Lampada precisa ser criada junto
		lampada = new Lampada();
	}	
	
	public void acenderLampada() {
		lampada.ligar();
	}
	public void verLampada() {
		lampada.isLigada();
	}
}
