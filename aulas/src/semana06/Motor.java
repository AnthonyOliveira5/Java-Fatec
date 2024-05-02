package semana06;

public class Motor {
	
	private final int VELOCIDADE_MAXIMA = 100;
	private final int VELOCIDADE_MINIMA = 0;
	private boolean status;
	private int velocidade;
	
	 /**
	  * Imprime o estado atual do objeto
	  */
	public void mostrar() {
	 System.out.println(status);
	 System.out.println(velocidade);
	}
	/**
	 * liga o motor
	 */
	public void ligar() {
		status = true;
		
	}
	/**
	 * desliga o motor
	 */
	public void desligar() {
		status = false;
	}
	 
	/**
	 * Acelera em 1 a velocidade, limitada a velocidade máxima
	 */
	public void acelerar() {
		if(velocidade < VELOCIDADE_MAXIMA) {
			velocidade ++;
		}
	}
	
	/**
	 * Reduz em 1 a velocidade
	 */
	public void frear() {
		if(velocidade > VELOCIDADE_MINIMA) {
			velocidade--;
		}
	} 
}
 
