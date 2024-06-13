package semana11banco;

import java.sql.SQLException;

public class ConsultaProdutosParametro {

	public static void main(String[] args) {
		
		BD bd = new BD();
		
		if(bd.getConnection()) {
			String sql = "select * from produtos where id < ? and id > ?";
			
			try{
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(1, 3);
				bd.st.setInt(2, 1);
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
