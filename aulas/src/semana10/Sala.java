package semana10;

public class Sala extends Comodo {
	
	public float metros;
	public Lampada lampada;
	
	public Sala() { //representação de uma Composição - Ao criar o objeto Sala, uma Lampada precisa ser criada junto
		lampada = new Lampada();
	}	
	
	public void acenderLampada() {
		lampada.ligar();
	}
	public void verLampada() {
		lampada.isLigada();
	}
}
