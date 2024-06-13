package semana12;

public class App {

	public static void main(String[] args) {
		
		Abacaxi abacaxi = new Abacaxi();
		abacaxi.descascar();
		Laranja laranja = new Laranja();
		laranja.descascar();
		Banana banana = new Banana();
		banana.descascar();
		Descascador.descascar(banana);
	}

}
