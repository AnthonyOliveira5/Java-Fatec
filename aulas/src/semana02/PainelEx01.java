package semana02;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelEx01 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfValor1;
	private JTextField tfValor2;
	private JTextField tfResultado;

	/**
	 * Create the panel.
	 */
	public PainelEx01() {
		setBackground(new Color(255, 255, 0));
		setLayout(null);
		
		JLabel lblValor1 = new JLabel("Valor 1");
		lblValor1.setBounds(25, 57, 46, 14);
		add(lblValor1);
		
		JLabel lblValor2 = new JLabel("Valor 2");
		lblValor2.setBounds(25, 82, 46, 14);
		add(lblValor2);
		
		tfValor1 = new JTextField();
		tfValor1.setBounds(81, 54, 86, 20);
		add(tfValor1);
		tfValor1.setColumns(10);
		
		tfValor2 = new JTextField();
		tfValor2.setColumns(10);
		tfValor2.setBounds(81, 79, 86, 20);
		add(tfValor2);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(10, 215, 67, 14);
		add(lblResultado);
		
		tfResultado = new JTextField();
		tfResultado.setEnabled(false);
		tfResultado.setColumns(10);
		tfResultado.setBounds(67, 213, 347, 17);
		add(tfResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n1 = Float.parseFloat(tfValor1.getText());
				float n2 = Float.parseFloat(tfValor2.getText());
				
				if(n1<0 || n1 > 10) {
					JOptionPane.showMessageDialog(btnCalcular, "Valor inválido!");
					tfValor1.setText("");
					tfValor2.requestFocus();
				}
				else {
					if(n2<0 || n2 > 10) {
						JOptionPane.showMessageDialog(btnCalcular, "Valor inválido!");
						tfValor1.setText("");
						tfValor2.requestFocus();
					}
					else {
						tfResultado.setText("Soma: " + (n1+n2) +
								"\nSubtração: " + (n1-n2) +
								"\nMultiplicação: " + (n1*n2) +
								"\nDivisão: " + (n1/n2));
						
					}
				}
			}
		});
		btnCalcular.setBounds(25, 152, 89, 23);
		add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfValor1.setText("");
				tfValor2.setText("");
				tfResultado.setText("");
				tfValor1.requestFocus();
			}
		});
		btnLimpar.setBounds(125, 152, 89, 23);
		add(btnLimpar);
		
		JLabel lblExercicio = new JLabel("Exercicio que mostra as 4 operações");
		lblExercicio.setBounds(25, 11, 278, 14);
		add(lblExercicio);

	}
}
