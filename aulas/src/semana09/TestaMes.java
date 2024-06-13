package semana09;

import javax.swing.JOptionPane;

public class TestaMes {

	public static void main(String[] args) {

		try {
			digitarMes();
			// continuação do software
		} catch (MesInvalidoException e) {
			System.out.println(e);
		}

	}
	
	public static void digitarMes() throws MesInvalidoException {
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Número do mês:"));
		if(mes < 0) {
			throw new MesInvalidoException("Mês Negativo");
		}
		else if (mes > 12) {
			throw new MesInvalidoException("Mês maior que 12!");
		}
	}
}
