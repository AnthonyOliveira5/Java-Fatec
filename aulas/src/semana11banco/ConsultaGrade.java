package semana11banco;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import semana11services.MyTableModel;

public class ConsultaGrade extends JFrame {

	private JTable tbProdutos;
	private DefaultTableModel model;
	private JScrollPane spProdutos;
	private JTextField tfFiltro;
	private BD bd;
	
	public ConsultaGrade() {
		setTitle("Consulta Produtos");
		setBounds(100,100,600,500);
		setLayout(new BorderLayout());
		tfFiltro = new JTextField();
		add(tfFiltro,BorderLayout.NORTH);
		tbProdutos = new JTable();
		bd = new BD();
		if(bd.getConnection()) {
			carregarTabela();
		}
		else {
			JOptionPane.showMessageDialog(spProdutos,"Falha na conexão");
			System.exit(0);
		}
		tfFiltro.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				String sql = "select * from produtos where nome "
						+ "like '%"+tfFiltro.getText()+"%'";
				model = MyTableModel.getModel(bd, sql);
				tbProdutos.setModel(model);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	
	private void carregarTabela() {
		String sql = "select * from produtos";
		model = MyTableModel.getModel(bd, sql);
		tbProdutos.setModel(model);
		spProdutos = new JScrollPane(tbProdutos);
		add(spProdutos,BorderLayout.CENTER);
		
	}


	public static void main(String[] args) {
		ConsultaGrade cg = new ConsultaGrade();
		cg.setVisible(true);
		cg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
