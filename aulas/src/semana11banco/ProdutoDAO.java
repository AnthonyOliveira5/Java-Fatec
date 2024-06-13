package semana11banco;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProdutoDAO {

	private BD bd;
	private String query, mensagem;

	public ProdutoDAO() {
		bd = new BD();
	}

	public String gravar(Produto produto) {
		query = "insert into produtos values (?,?,?,?)";
		mensagem = "Produto inserido com sucesso";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(query);
			bd.st.setInt(1, produto.getId());
			bd.st.setString(2, produto.getNome());
			bd.st.setInt(3, produto.getEstoque());
			bd.st.setDouble(4, produto.getPreco());
			int n = bd.st.executeUpdate();
			System.out.println("Linhas inseridas: " + n);

		} catch (SQLException e) {
			query = "update produtos set nome = ?, estoque = ?, preco = ? where id = ?";
			try {
				bd.st = bd.con.prepareStatement(query);
				bd.st.setString(1, produto.getNome());
				bd.st.setInt(2, produto.getEstoque());
				bd.st.setDouble(3, produto.getPreco());
				bd.st.setInt(4, produto.getId());
				int n = bd.st.executeUpdate();
				System.out.println("Linhas alteradas: " + n);
				if (n == 1) {
					mensagem = "produto alterado com sucesso!";
				} else {
					mensagem = "produto não encontrado!";

				}
			} catch (SQLException e1) {
				mensagem = "Falha, " + e1;
			}
		} finally {
			bd.close();
		}

		return mensagem;

	}

	public String excluir(int id) {
		query = "delete from produtos where id = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(query);
			bd.st.setInt(1, id);
			int n = bd.st.executeUpdate();
			System.out.println("Linhas excluidas: " + n);
			if (n == 1) {
				mensagem = "produto excluido com sucesso!";
			} else {
				mensagem = "produto não encontrado!";

			}
		} catch (SQLException e1) {
			mensagem = "Falha, " + e1;
		} finally {
			bd.close();
		}
		return mensagem;

	}

	public List<Produto> get() {
		return null;

	}
}
