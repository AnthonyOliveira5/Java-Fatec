package semana12interfaces;

public class UsaVida {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Animal animal = new Animal();
		ET et = new ET();
		
		Vida.viver(pessoa);
		Vida.viver(animal);
		Vida.viver(et);
		
	}
}
