package semana03;

import javax.swing.JOptionPane;

public class Excecao03 {

	public static void main(String[] args) {
		try {
			int valorPagar = Integer.parseInt(
					JOptionPane.showInputDialog("Valor a pagar?"));

			int numeroParcelas = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Quantidade de parcelas: "));

			JOptionPane.showMessageDialog(null, "Valor da parcela: " + (valorPagar/numeroParcelas));

		}
		catch(Exception erro) {
			System.out.println(erro.getMessage());
		}

		//catch(NumberFormatException|ArithmeticException erro) {
		//	System.out.println("Forneça apenas valores inteiros");
		//}
		//catch(ArithmeticException erro) {
		//	System.out.println("O número de parcelas não pode ser zero!");
		//}
	}
}
