package semana11banco;

import java.sql.SQLException;

public class ConsultaProdutoSomaTotal {

	public static void main(String[] args) {
		
		BD bd = new BD();
		
		if(bd.getConnection()) {
			String sql = "select preco from produtos";
			
			try{
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				double total = 0;
				while(bd.rs.next()) {
					
					total += bd.rs.getDouble("preco");
				}
				System.out.println("Soma dos preços: " + total);
				sql = "select sum(preco) as total from produtos";
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				bd.rs.next();
				System.out.println("soma dos preços 2: " + bd.rs.getDouble("total"));
			}
			catch(SQLException e) {
				System.out.println(e);
				e.printStackTrace();
			}finally {
				bd.close();
			}
			
		} 
		
	}

}
