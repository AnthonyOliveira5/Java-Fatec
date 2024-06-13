package semana11banco;

import java.awt.BorderLayout;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import semana11services.MyTableModel;

public class ConsultaGradeSemFiltro extends JFrame{
	
	private JTable tbProdutos;
	private DefaultTableModel model;
	private JScrollPane spProdutos;
	private BD bd;
	
	public ConsultaGradeSemFiltro() {
		setTitle("Consulta Produtos");
		setBounds(100,100,600,500);
		setLayout(new BorderLayout());
		
		tbProdutos = new JTable();
		bd = new BD();
		if(bd.getConnection()) {
			carregarTabela();
		}
		else {
			JOptionPane.showMessageDialog(spProdutos, "Falha na conexão!");
			System.exit(0);
		}
	}
	
	private void carregarTabela() {
		String sql = "select * from produtos";
		model = MyTableModel.getModel(bd, sql);
		tbProdutos.setModel(model);
		spProdutos = new JScrollPane(tbProdutos);
		add(spProdutos, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		ConsultaGrade cg = new ConsultaGrade();
		cg.setVisible(true);
		cg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
