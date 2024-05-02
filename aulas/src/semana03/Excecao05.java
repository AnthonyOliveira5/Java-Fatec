package semana03;

import javax.swing.JOptionPane;

public class Excecao05 {
//Exceção unchecked tem risco de dar erro durante a execução
	public static void main(String[] args) {

		while (true) {
			try {
				String s = JOptionPane.showInputDialog("Digite sua idade");
				if(s==null) break;
				int idade = Integer.parseInt(s);
				JOptionPane.showMessageDialog(null, idade);
				break;
			}
			catch(NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Forneça apenas valores inteiros.");
				System.out.println(erro);
			}
		}
	}
}
