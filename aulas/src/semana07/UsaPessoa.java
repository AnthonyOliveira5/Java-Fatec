package semana07;

import semana08.Pessoa;
import semana08.PessoaFisica;

public class UsaPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.getClass());
		
		
		PF pessoa2 = new PF();
		
		System.out.println(pessoa2.nome);
		//System.out.println(pessoa2.apelido); // não é visível fora do pacote/hierarquia
		
		pessoa2.setCodigo(100);
		
		
	}

}
