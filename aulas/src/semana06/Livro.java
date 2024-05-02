package semana06;

import javax.swing.JOptionPane;

public class Livro {
	
	private int isbn;
	private String titulo;
	private double preco;
	
	public void mostrar() {
		System.out.println(isbn+"-"+titulo+"-"+preco);
	}
	
	
	public Livro() { //default?
		
	}
	
	public Livro(String titulo) {
		this.titulo = titulo;
	}
	
	public Livro(int isbn, String titulo) {
		this.isbn = isbn;
		this.titulo = titulo;
	}
	public Livro(int isbn, String titulo, double preco) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public String toString() {
		return "["+isbn+","+titulo+","+preco+"]";
	}
	
	//meio esquisito
	public void digitar() {
		isbn = Integer.parseInt(JOptionPane.showInputDialog("ISBN:"));
		titulo = JOptionPane.showInputDialog("Título:");
		preco = Double.parseDouble(JOptionPane.showInputDialog("Preço: "));
	}
}
