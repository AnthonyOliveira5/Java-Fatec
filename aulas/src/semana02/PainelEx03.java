package semana02;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelEx03 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfValor1;
	private JTextField tfResultado;

	/**
	 * Create the panel.
	 */
	public PainelEx03() {
		setBackground(new Color(0, 128, 128));
		setLayout(null);
		
		JLabel lblMetragem = new JLabel("Metragem:");
		lblMetragem.setBounds(25, 57, 67, 14);
		add(lblMetragem);
		
		tfValor1 = new JTextField();
		tfValor1.setColumns(10);
		tfValor1.setBounds(102, 54, 86, 20);
		add(tfValor1);
		
		JLabel lblCentimetros = new JLabel("Centimetros");
		lblCentimetros.setBounds(25, 134, 89, 14);
		add(lblCentimetros);
		
		tfResultado = new JTextField();
		tfResultado.setEnabled(false);
		tfResultado.setColumns(10);
		tfResultado.setBounds(124, 132, 216, 17);
		add(tfResultado);
		
		JButton btnTransformar = new JButton("Transformar");
		btnTransformar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n1 = Float.parseFloat(tfValor1.getText());
				
				if(n1<0) {
					JOptionPane.showMessageDialog(btnTransformar, "Valor inválido!");
					tfValor1.setText("");
					tfValor1.requestFocus();
				}
					else {
						float media = (n1)*100;
						tfResultado.setText("" + media);
						}
					}
		});
		
		btnTransformar.setBounds(25, 100, 98, 23);
		add(btnTransformar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfValor1.setText("");
				tfResultado.setText("");
				tfValor1.requestFocus();
			}
		});
		btnLimpar.setBounds(133, 100, 89, 23);
		add(btnLimpar);
		
		JLabel lblExercicioQueTransforma = new JLabel("Exercicio que transforma metros para centímetros");
		lblExercicioQueTransforma.setBounds(25, 11, 278, 14);
		add(lblExercicioQueTransforma);

	}

}
