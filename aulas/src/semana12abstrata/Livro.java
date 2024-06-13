package semana12abstrata;

public class Livro extends Obra {
	
	public Autor[] autor;
	
	public void setAutor(Autor[] autor) {
		this.autor= autor;
	}
	
	public void x() {
		insert();
		titulo = "oi";
	}
}
