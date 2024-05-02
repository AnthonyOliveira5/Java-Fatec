package semana02;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelMedia extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNota1;
	private JTextField tfNota2;
	private JTextField tfMedia;

	/**
	 * Create the panel.
	 */
	public PainelMedia() {
		setBackground(new Color(0, 255, 0));
		setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setBounds(10, 11, 49, 14);
		add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setBounds(10, 62, 49, 14);
		add(lblNota2);
		
		JLabel lblMedia = new JLabel("Média");
		lblMedia.setBounds(10, 117, 49, 14);
		add(lblMedia);
		
		tfNota1 = new JTextField();
		tfNota1.setBounds(51, 8, 96, 20);
		add(tfNota1);
		tfNota1.setColumns(10);
		
		tfNota2 = new JTextField();
		tfNota2.setBounds(51, 59, 96, 20);
		add(tfNota2);
		tfNota2.setColumns(10);
		
		tfMedia = new JTextField();
		tfMedia.setEditable(false);
		tfMedia.setBounds(51, 114, 96, 20);
		add(tfMedia);
		tfMedia.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n1 = Float.parseFloat(tfNota1.getText());
				float n2 = Float.parseFloat(tfNota2.getText());
				
				if(n1<0 || n1 > 10) {
					JOptionPane.showMessageDialog(btnCalcular, "Nota inválida!");
					tfNota1.setText("");
					tfNota1.requestFocus();
				}
				else {
					if(n2<0 || n2 > 10) {
						JOptionPane.showMessageDialog(btnCalcular, "Nota inválida!");
						tfNota2.setText("");
						tfNota2.requestFocus();
					}
					else {
						float media = (n1+n2)/2;
						tfMedia.setText("" + media);
					}
				}
			}
		});
		btnCalcular.setBounds(10, 162, 89, 23);
		add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNota1.setText("");
				tfNota2.setText("");
				tfMedia.setText("");
				tfNota1.requestFocus();
			}
		});
		btnLimpar.setBounds(119, 162, 89, 23);
		add(btnLimpar);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBackground(new Color(255, 255, 0));
		lblResultado.setBounds(10, 245, 303, 14);
		add(lblResultado);

	}
}
