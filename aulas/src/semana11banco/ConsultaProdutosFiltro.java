package semana11banco;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConsultaProdutosFiltro {

	public static void main(String[] args) {
		
		BD bd = new BD();
		
		if(bd.getConnection()) {
			String sql = "select * from produtos where nome like ?";
			
			try{
				String s = JOptionPane.showInputDialog("Digite o filtro");
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, "%"+s+"%");

				bd.rs = bd.st.executeQuery();
				while(bd.rs.next()) {
					System.out.println(bd.rs.getInt("id"));
					System.out.println(bd.rs.getString("nome"));
					System.out.println(bd.rs.getInt("estoque"));
					System.out.println(bd.rs.getDouble("preco"));
					System.out.println("------------------------------");
				}
				
			}
			catch(SQLException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		} else {
			System.out.println("Falha na conexão");
		}
	}

}
