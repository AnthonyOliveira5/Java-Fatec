package semana08;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa {
	
	
	public String cpf, rg;
	
	public void digitar() {
		super.digitar(); //usar o digitar de pessoa
		cpf = JOptionPane.showInputDialog("CPF?");
		rg = JOptionPane.showInputDialog("RG?");
		
	}
}
