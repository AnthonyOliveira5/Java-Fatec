package semana12atividade05;

public class Hexagono extends FigurasGeometricas {

	private final int LADOSHEXAGONO = 6;
	private double tamanhoLados;
	
	public Hexagono() {
	}
	
	public Hexagono(double tamanhoLados) {
		this.tamanhoLados = tamanhoLados;
	}
	
	@Override
	public double calcularPerimetro() {
		System.out.println("O perimetro do Hexagono é: " + LADOSHEXAGONO * tamanhoLados);
		return LADOSHEXAGONO * tamanhoLados;
	}
	@Override
	public double calcularArea() {
		double areaHexagono = Math.pow(tamanhoLados, 2) * (3*Math.sqrt(3))/2;
		System.out.println("A área do Hexagono é: " + areaHexagono);
		return areaHexagono;
	}

}
