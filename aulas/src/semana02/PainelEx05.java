package semana02;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelEx05 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfHoras;
	private JTextField tfRecebeHora;
	private JTextField tfResultado;

	/**
	 * Create the panel.
	 */
	public PainelEx05() {
		setBackground(new Color(255, 0, 128));
		setLayout(null);
		
		JLabel lblHorasTrabalhadas = new JLabel("Horas trabalhadas:");
		lblHorasTrabalhadas.setBounds(25, 57, 128, 14);
		add(lblHorasTrabalhadas);
		
		JLabel lblValorRecebidoPor = new JLabel("Valor recebido por hora:");
		lblValorRecebidoPor.setBounds(25, 82, 152, 14);
		add(lblValorRecebidoPor);
		
		tfHoras = new JTextField();
		tfHoras.setColumns(10);
		tfHoras.setBounds(167, 54, 86, 20);
		add(tfHoras);
		
		tfRecebeHora = new JTextField();
		tfRecebeHora.setColumns(10);
		tfRecebeHora.setBounds(167, 79, 86, 20);
		add(tfRecebeHora);
		
		JLabel lblSeuSalrio = new JLabel("Seu salário:");
		lblSeuSalrio.setBounds(10, 215, 67, 14);
		add(lblSeuSalrio);
		
		tfResultado = new JTextField();
		tfResultado.setEnabled(false);
		tfResultado.setColumns(10);
		tfResultado.setBounds(87, 213, 166, 17);
		add(tfResultado);
		
		JButton btnCalcular = new JButton("Calcular salário");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n1 = Float.parseFloat(tfHoras.getText());
				float n2 = Float.parseFloat(tfRecebeHora.getText());
				
				if(n1<0 ) {
					JOptionPane.showMessageDialog(btnCalcular, "Valor inválido!");
					tfHoras.setText("");
					tfRecebeHora.requestFocus();
				}
				else {
					if(n2<0 ) {
						JOptionPane.showMessageDialog(btnCalcular, "Valor inválido!");
						tfHoras.setText("");
						tfRecebeHora.requestFocus();
					}
					else {
						float salario = (n1*n2)*22;
						tfResultado.setText("" + salario);
					}
				}
			}
		});
		btnCalcular.setBounds(25, 152, 152, 23);
		add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfHoras.setText("");
				tfRecebeHora.setText("");
				tfResultado.setText("");
				tfHoras.requestFocus();
			}
		});
		btnLimpar.setBounds(183, 152, 89, 23);
		add(btnLimpar);
		
		JLabel lblExercicioCalculaSalrio = new JLabel("Exercicio calcula Salário");
		lblExercicioCalculaSalrio.setBounds(25, 11, 278, 14);
		add(lblExercicioCalculaSalrio);

	}

}
