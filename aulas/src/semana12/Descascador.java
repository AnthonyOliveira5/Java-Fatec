package semana12;

public class Descascador {

	public static void descascar(Fruta fruta) {
		fruta.descascar();
	}
	
	public static void main(String[] args) {
		
		Fruta fruta = new Laranja();
		descascar(fruta);
		fruta = new Abacaxi();
		descascar(fruta);
		fruta = new Banana();
		descascar(fruta);
		fruta = new Jaca();
		descascar(fruta);
		
	}

}
