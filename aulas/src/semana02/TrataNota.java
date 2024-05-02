package semana02;

import javax.swing.JOptionPane;

public class TrataNota {

	public static void main(String[] args) {
		//enquanto a nota for inválida, permaneça no laço
		
		double n1 = 20;
		while(n1<0 || n1>10) {
			n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite n1"));
		}
		double n2=20;
		while(n2<0 || n2>10) {
			n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite n2"));
		}
		JOptionPane.showMessageDialog(null, (n1+n2)/2);

	}

}
