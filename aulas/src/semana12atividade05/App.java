package semana12atividade05;

public class App {

	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo(10,20);
		Calculadora.calcularArea(retangulo);
		Calculadora.calcularPerimetro(retangulo);
		
		Triangulo triangulo = new Triangulo(20, 20, 20);
		Calculadora.calcularArea(triangulo);
		Calculadora.calcularPerimetro(triangulo);
		
		Hexagono hexagono = new Hexagono(5);
		Calculadora.calcularArea(hexagono);
		Calculadora.calcularPerimetro(hexagono);
		
	}
}
