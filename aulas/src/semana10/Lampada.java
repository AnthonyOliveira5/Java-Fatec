package semana10;

public class Lampada {
	
	private boolean status;
	
	public void ligar() {
		status = true;
	}
	public void desligar() {
		status = false;
	}
	public boolean isLigada() {
		return status;
	}
}
