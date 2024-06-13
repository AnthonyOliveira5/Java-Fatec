package semana12atividade05;

public class Triangulo extends FigurasGeometricas {
	
	private double ladosTriangulo = 3;
	private double baseTriangulo;
	private double alturaTriangulo;
	private double tamanhoLados;
	
	public Triangulo() {
	}
	
	public Triangulo(double baseTriangulo, double alturaTriangulo, double tamanhoLados) {
		this.baseTriangulo = baseTriangulo;
		this.alturaTriangulo = alturaTriangulo;
		this.tamanhoLados = tamanhoLados;
	}
	
	@Override
	public double calcularPerimetro() {
		System.out.println("O perimetro do triangulo é: " + ladosTriangulo * tamanhoLados);
		return ladosTriangulo * tamanhoLados;
	}
	@Override
	public double calcularArea() {
		System.out.println("A área do triangulo é: " + (baseTriangulo * alturaTriangulo)/2);
		return (baseTriangulo * alturaTriangulo)/2;
	}
}
