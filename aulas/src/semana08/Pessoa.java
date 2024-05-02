package semana08;

import javax.swing.JOptionPane;

public class Pessoa {

	public int codigo;
	public String nome;
	protected String apelido; // Hierarquia e pacote
	
	public void digitar() {
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Código? "));
		nome = JOptionPane.showInputDialog("Nome?");
		apelido = JOptionPane.showInputDialog("Apelido?");
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
