package semana07atividade04;

public class Televisao {
	
	/**
	 * status - verifica se a televisão está ligada ou não
	 * volume - indica o valor que o volume está
	 * canal - indica o canal que a televisão está
	 */
	public final int FINAL = 10;
	public final int MINIMO = 0;
	private boolean status = false;
	private int volume = 0;
	private int canal = 0;
	
	public Televisao() {
		
	}
	
	public Televisao(boolean status, int volume, int canal) {
		this.status = status;
		this.volume = volume;
		this.canal = canal;
	}
	
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public String toString() {
		return "Televisao [status=" + status + ", volume=" + volume + ", canal=" + canal + "]";
	}
	
	/**
	 * Liga a televisão
	 */
	public void ligarTelevisao() {
		setStatus(true);
		System.out.println("A televisão foi ligada.");
		
	}
	
	/**
	 * desliga a televisão
	 */
	public void desligarTelevisao() {
		setStatus(false);
		System.out.println("A televisão foi desligada.");
	}
	
	/**
	 * aumenta o volume da televisão
	 * 
	 */
	public void aumentarVolume() {
		if(status == false) {
			System.out.println("A televisão está desligada");
		}else if(volume <= FINAL) {
			volume++;
			System.out.println("volume: " + volume);
		} else {
			System.out.println("O volume já está no máximo");
		}
	}
	
	/**
	 * diminui o volume da televisão
	 */
	public void diminuirVolume() {
		if(status == false) {
			System.out.println("A televisão está desligada");
		}else if(volume > MINIMO) {
			volume--;
			System.out.println("Volume: " + volume);
		} else {
			System.out.println("O volume já está no mínimo");
		}
	}
	
	/**
	 * Vai para o próximo canal
	 */
	public void aumentarCanal() {
		if(status == false) {
			System.out.println("A televisão está desligada");
		}else if(canal <= FINAL) {
			canal++;
			System.out.println("canal: " + canal);
		} else {
			System.out.println("Você está no último canal");
		}
	}
	
	/**
	 * volta pro canal anterior
	 */
	public void diminuirCanal() {
		if(status == false) {
			System.out.println("A televisão está desligada");
		}else if(canal > MINIMO) {
			canal--;
			System.out.println("canal: " + canal);
		} else {
			System.out.println("Você está no primeiro canal");
		}
	}
}
