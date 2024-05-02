package semana08;

public class UsaPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.getClass());
		
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		
		System.out.println(pessoaFisica.nome);
		System.out.println(pessoaFisica.apelido);
		
		pessoaFisica.setCodigo(100);
		
		pessoaFisica.digitar();
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.digitar();
		
		
	}

}
