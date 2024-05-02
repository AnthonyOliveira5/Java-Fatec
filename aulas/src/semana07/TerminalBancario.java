package semana07;

public class TerminalBancario {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(1, 2000, "Anthony");
		Conta c2 = new Conta(2, 1000, "Sérgio");
		Conta.banco = "Itau";
		
		
		Conta.transferir(c1, c2, 200);
		c1.consultar();
		c2.consultar();
		
		/*Conta c1 = new Conta();
		c1.consultar();
		Conta c2 = new Conta(1, 100000, "Anthony");
		System.out.println(c2.depositar(1000));
		c2.consultar();
		System.out.println(c2.sacar(300));
		c2.consultar();*/
		
		

	}
}
