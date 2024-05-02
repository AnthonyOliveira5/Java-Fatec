package semana05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Paralelo {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paralelo window = new Paralelo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Paralelo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btStart = new JButton("Iniciar");
		btStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Thread t1 = new Thread(new Runnable() {
					public void run() {
						for(int i=1; i<=10; i++) {
							tf1.setText(""+i);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e1) {}
						}
					}
						
				});
				Thread t2 = new Thread(new Runnable() {
					public void run() {
						for(int i=10; i>=1; i--) {
							tf2.setText(""+i);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e1) {}
						}
					}
						
				});
				t1.start();
				t2.start();
				
				
			}
		});
		btStart.setBounds(67, 34, 89, 23);
		frame.getContentPane().add(btStart);
		
		tf1 = new JTextField();
		tf1.setBounds(94, 112, 96, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(215, 112, 96, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
	}
}
