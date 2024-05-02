package semana02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Frame01 frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Frame01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame01() {
		setResizable(false);
		setTitle("Minha aplicação");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 440);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnExemplos = new JMenu("Exemplos");
		menuBar.add(mnExemplos);
		
		JMenuItem miFor = new JMenuItem("For");
		miFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(miFor, "For");
				PainelFor p = new PainelFor();
				frame.setContentPane(p);
				frame.revalidate(); //refresh
				frame.repaint();
				
			}
		});
		mnExemplos.add(miFor);
		
		JMenuItem miWhile = new JMenuItem("Media");
		miWhile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelMedia p = new PainelMedia();
				frame.setContentPane(p);
				frame.revalidate(); //refresh
				frame.repaint();
			}
		});
		mnExemplos.add(miWhile);
		
		JMenuItem miIf = new JMenuItem("If");
		mnExemplos.add(miIf);
		
		JMenu mnExercicios = new JMenu("Exercícios");
		menuBar.add(mnExercicios);
		
		JMenuItem miEx1 = new JMenuItem("Ex1");
		miEx1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelEx01 p = new PainelEx01();
				frame.setContentPane(p);
				frame.revalidate();
				frame.repaint();
			}
		});
		mnExercicios.add(miEx1);
		
		JMenuItem miEx2 = new JMenuItem("Ex2");
		miEx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelEx02 p = new PainelEx02();
				frame.setContentPane(p);
				frame.revalidate();
				frame.repaint();
			}
		});
		mnExercicios.add(miEx2);
		
		JMenuItem miEx3 = new JMenuItem("Ex3");
		miEx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelEx03 p = new PainelEx03();
				frame.setContentPane(p);
				frame.revalidate();
				frame.repaint();
			}
		});
		mnExercicios.add(miEx3);
		
		JMenuItem miEx4 = new JMenuItem("Ex4");
		miEx4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelEx04 p = new PainelEx04();
				frame.setContentPane(p);
				frame.revalidate();
				frame.repaint();
			}
		});
		mnExercicios.add(miEx4);
		
		JMenuItem miEx5 = new JMenuItem("Ex5");
		miEx5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelEx05 p = new PainelEx05();
				frame.setContentPane(p);
				frame.revalidate();
				frame.repaint();
			}
		});
		mnExercicios.add(miEx5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
