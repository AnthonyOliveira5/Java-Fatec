package semana07atividade04;

public class UsaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente("34253222", "Anthony");
		Cliente cliente3 = new Cliente("34254352342", "Teste 2", "19472178316");
		
		cliente1.getCpf();
		cliente1.setCpf("4352432");
		System.out.println(cliente1.getCpf());
		cliente1.getNome();
		cliente1.setNome("Teste");
		cliente1.setTelefone("24314214341");
		
		cliente2.getCpf();
		cliente2.setCpf("56746457");
		cliente2.getNome();
		System.out.println(cliente2.getNome());
		cliente2.setNome("Teste Teste");
		System.out.println(cliente2.getNome());
		cliente2.setTelefone("2346567875");
		
		cliente3.getCpf();
		cliente3.setCpf("345672332");
		cliente3.getNome();
		cliente3.setNome("Teste Teste Teste");
		System.out.println(cliente3.getTelefone());
		cliente3.setTelefone("1234567876");
		
		
		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		System.out.println(cliente3.toString());
		
		cliente1.gravarCliente();
		cliente1.lerCliente();
		System.out.println(cliente1.lerCliente());
		
	}
}
