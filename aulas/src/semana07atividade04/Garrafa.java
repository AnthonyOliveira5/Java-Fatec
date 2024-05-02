package semana07atividade04;

public class Garrafa {
	
	/**
	 * nomeConteudo - o que tem dentro da garrafa
	 * lacrada- se a garrafa já foi aberta uma vez
	 * status - se a garrafa esta aberta ou fechada no momento
	 * conteudoMl - quantidade de líquido que tem dentro da garrafa, em Ml
	 */
	private String nomeConteudo;
	private boolean lacrada = true;
	private boolean status = false;
	private int conteudoMl;
	
	public Garrafa() {
		
	}
	
	public Garrafa(String nomeConteudo, int conteudoMl) {
		this.nomeConteudo = nomeConteudo;
		this.conteudoMl = conteudoMl;
	}
	
	public Garrafa(String nomeConteudo, boolean lacrada, boolean status, int conteudoMl) {
		this.nomeConteudo = nomeConteudo;
		this.lacrada = lacrada;
		this.status = status;
		this.conteudoMl = conteudoMl;
	}
	
	public String getNomeConteudo() {
		return nomeConteudo;
	}
	
	public void setNomeConteudo(String nomeConteudo) {
		this.nomeConteudo = nomeConteudo;
	}
	
	public boolean getLacrada() {
		return lacrada;
	}
	
	public void setLacrada(boolean lacrada) {
		this.lacrada = lacrada;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getConteudoMl() {
		return conteudoMl;
	}
	
	public void setConteudoMl(int conteudoMl) {
		this.conteudoMl = conteudoMl;
	}
	
	/**
	 * Abrirgarrafa - método que abre a garrafa se ela estiver fechada
	 */
	public void abrirGarrafa() {
		
		if(status == true) {
			System.out.println("A garrafa já está aberta");
		}
		setStatus(true);
	}
	
	public String toString() {
		return "Garrafa [nomeConteudo=" + nomeConteudo + ", status=" + status + ", conteudoMl=" + conteudoMl + "]";
	}
	
	/**
	 * fecharGarrafa - método que fecha a garrafa se ela estiver aberta
	 */
	public void fecharGarrafa() {
		if(status == false) {
			System.out.println("A garrafa já está fechada");
		}
		setStatus(false);
	}	
	
	public static void main(String[] args) {
		
		Garrafa garrafa1 = new Garrafa("Garrafa de agua", 100);
		
		System.out.println(garrafa1);
		garrafa1.abrirGarrafa();
		System.out.println(garrafa1);
		garrafa1.abrirGarrafa();
		System.out.println(garrafa1);
		garrafa1.fecharGarrafa();
		System.out.println(garrafa1);
		garrafa1.fecharGarrafa();
		
	}
}
