package semana12atividade05;

public class Retangulo extends FigurasGeometricas{
	
	private double baseRetangulo;
	private double alturaRetangulo;
	
	public Retangulo() {
	}
	
	public Retangulo(double baseRetangulo, double alturaRetangulo) {
		this.baseRetangulo = baseRetangulo;
		this.alturaRetangulo = alturaRetangulo;
	}
	
	@Override
	public double calcularPerimetro() {
		System.out.println("O perimetro do retangulo é: " + (baseRetangulo + alturaRetangulo) * 2);
		return (baseRetangulo + alturaRetangulo) * 2;
	}
	@Override
	public double calcularArea() {
		System.out.println("A área do retangulo é: " + baseRetangulo * alturaRetangulo);
		return baseRetangulo * alturaRetangulo;
	}
}
