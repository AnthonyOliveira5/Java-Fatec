package semana07;

public class Livro {
	private String titulo;
	private int qtdePaginas;
	private double preco;
	private boolean novo;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setQtdePaginas(int  qtdePaginas) {
		this.qtdePaginas = qtdePaginas;
	}
	public void setPreco(double preco) {
		if(preco>0) {
			this.preco = preco;
		}
	}
	public void setNovo(boolean novo) {
		this.novo = novo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getQtdePaginas() {
		return qtdePaginas;
	}
	public double getPreco() {
		return preco;
	}
	public boolean isNovo() {
		return novo;
	}
	public Livro(String titulo, int qtdePaginas, double preco, boolean novo) {
		this.titulo = titulo;
		this.qtdePaginas = qtdePaginas;
		this.preco = preco;
		this.novo = novo;
	}
	public String toString() {
		return "Livro [titulo=" + titulo + ", qtdePaginas=" + qtdePaginas + ", preco=" + preco + ", novo=" + novo + "]";
	}
	
}
