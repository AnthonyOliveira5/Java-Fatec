package semana11banco;

public class ProdutoIncluirTeste {

	public static void main(String[] args) {

		Produto produto = new Produto(5,"Sabão 2", 100, 3.23);
		ProdutoDAO produtoDao = new ProdutoDAO();
		System.out.println(produtoDao.gravar(produto));
		}

}
