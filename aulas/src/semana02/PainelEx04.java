package semana02;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PainelEx04 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfBase;
	private JTextField tfAltura;
	private JTextField tfAreaDobro;

	/**
	 * Create the panel.
	 */
	public PainelEx04() {
		setBackground(new Color(128, 128, 255));
		setLayout(null);
		
		JLabel lblBase = new JLabel("Base Quadrado: ");
		lblBase.setBounds(25, 57, 110, 14);
		add(lblBase);
		
		JLabel lblAlturaQuadrado = new JLabel("Altura Quadrado:");
		lblAlturaQuadrado.setBounds(25, 82, 110, 14);
		add(lblAlturaQuadrado);
		
		tfBase = new JTextField();
		tfBase.setColumns(10);
		tfBase.setBounds(145, 57, 86, 20);
		add(tfBase);
		
		tfAltura = new JTextField();
		tfAltura.setColumns(10);
		tfAltura.setBounds(145, 82, 86, 20);
		add(tfAltura);
		
		JLabel lblValorDobradoDa = new JLabel("Valor dobrado da area do quadrado:");
		lblValorDobradoDa.setBounds(10, 215, 176, 14);
		add(lblValorDobradoDa);
		
		tfAreaDobro = new JTextField();
		tfAreaDobro.setEnabled(false);
		tfAreaDobro.setColumns(10);
		tfAreaDobro.setBounds(196, 213, 218, 17);
		add(tfAreaDobro);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n1 = Float.parseFloat(tfBase.getText());
				float n2 = Float.parseFloat(tfAltura.getText());
				
				if(n1<0 ) {
					JOptionPane.showMessageDialog(btnCalcular, "Valor inválido!");
					tfBase.setText("");
					tfAltura.requestFocus();
				}
				else {
					if(n2<0 ) {
						JOptionPane.showMessageDialog(btnCalcular, "Valor inválido!");
						tfBase.setText("");
						tfAltura.requestFocus();
					}
					else {
						float areaDobro = (n1*n2)*2;
						tfAreaDobro.setText("" + areaDobro);
					}
				}
			}
		});
		btnCalcular.setBounds(25, 152, 89, 23);
		add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfBase.setText("");
				tfAltura.setText("");
				tfAreaDobro.setText("");
				tfBase.requestFocus();
			}
		});
		btnLimpar.setBounds(125, 152, 89, 23);
		add(btnLimpar);
		
		JLabel lblExercicioQueCalcula = new JLabel("Exercicio que calcula a area de um quadrado e mostra o seu dobro");
		lblExercicioQueCalcula.setBounds(25, 11, 337, 14);
		add(lblExercicioQueCalcula);

	}

}
