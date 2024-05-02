package semana08;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuPI extends JFrame {
	
	private JButton btOriginal;
	private Botao btPersonal;
	
	public MeuPI() {
		setTitle("Meu PI");
		setBounds(0, 0, 500, 200);
		setLayout(new FlowLayout());
		btOriginal = new JButton("original");
		btPersonal = new Botao("personal");
		add(btOriginal);
		add(btPersonal);
	}
	public static void main(String[] args) {

		MeuPI frame = new MeuPI();
		frame.setVisible(true);

	}

}
