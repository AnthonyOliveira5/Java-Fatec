package semana02;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PainelEx02 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfValor1;
	private JTextField tfValor2;
	private JTextField tfResultado;
	private JTextField tfValor3;

	/**
	 * Create the panel.
	 */
	public PainelEx02() {
		setBackground(new Color(255, 128, 64));
		setLayout(null);
		
		JLabel lblValor1 = new JLabel("Valor 1");
		lblValor1.setBounds(25, 57, 46, 14);
		add(lblValor1);
		
		JLabel lblValor2 = new JLabel("Valor 2");
		lblValor2.setBounds(25, 82, 46, 14);
		add(lblValor2);
		
		tfValor1 = new JTextField();
		tfValor1.setColumns(10);
		tfValor1.setBounds(81, 54, 86, 20);
		add(tfValor1);
		
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
				float n3 = Float.parseFloat(tfValor3.getText());
				
				if(n1<0 || n1 > 10) {
					JOptionPane.showMessageDialog(btnCalcular, "Nota inválida!");
					tfValor1.setText("");
					tfValor1.requestFocus();
				}
				else {
					if(n2<0 || n2 > 10) {
						JOptionPane.showMessageDialog(btnCalcular, "Nota inválida!");
						tfValor2.setText("");
						tfValor2.requestFocus();
					}
					else {
						if(n3<0 || n3 > 10) {
							JOptionPane.showMessageDialog(btnCalcular, "Nota inválida!");
							tfValor3.setText("");
							tfValor3.requestFocus();
						}
						float media = (n1+n2+n3)/3;
						tfResultado.setText("" + media);
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
				tfValor3.setText("");
				tfResultado.setText("");
				tfValor2.requestFocus();
			}
		});
		btnLimpar.setBounds(125, 152, 89, 23);
		add(btnLimpar);
		
		JLabel lblExercicio = new JLabel("Exercicio que solicita 3 notas e realiza a média");
		lblExercicio.setBounds(25, 11, 278, 14);
		add(lblExercicio);
		
		JLabel lblValor3 = new JLabel("Valor 3");
		lblValor3.setBounds(25, 110, 46, 14);
		add(lblValor3);
		
		tfValor3 = new JTextField();
		tfValor3.setColumns(10);
		tfValor3.setBounds(81, 107, 86, 20);
		add(tfValor3);

	}

}
