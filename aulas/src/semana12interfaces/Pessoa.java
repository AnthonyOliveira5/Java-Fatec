package semana12interfaces;

public class Pessoa implements Fisio {

	@Override
	public void comer() {
		System.out.println("Pessoa comendo");
	}

	@Override
	public void beber() {
		System.out.println("Pessoa bebendo");
	}

	@Override
	public void dormir() {
		System.out.println("Pessoa dormindo");
	}

}
