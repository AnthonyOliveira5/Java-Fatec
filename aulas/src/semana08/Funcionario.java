package semana08;

import javax.swing.JOptionPane;

public class Funcionario extends PessoaFisica{
	
	public String cargo;
	public double salario;
	
	public void digitar() {
		super.digitar();
		cargo = JOptionPane.showInputDialog("Cargo?");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Salário?"));
	}
}
