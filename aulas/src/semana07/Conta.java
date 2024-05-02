package semana07;

public class Conta {
	
	public final int LIMITE_SAQUE = 1000;
	public final int LIMITE_DEPOSITO = 5000;
	private int numero;
	private double saldo;
	public static String banco; //variávela classe
	
	private String sql; //variável auxiliar
	
	public Conta() {
		
	}

	public Conta(int numero, double saldo, String banco) {
		this.numero = numero;
		//this.saldo = saldo;
		depositar(saldo);
		this.banco = banco;
	}
	
	
	public void consultar() {
		System.out.println(numero);
		System.out.println(banco);
		System.out.println(saldo);
	}
	
	/**
	 * Adiciona o valor recebido ao saldo
	 * O valor a ser depositado deve ser <= 5000;
	 * @param valor
	 */
	public String depositar(double valor) {
		
		String mensagem = "Depósito realizado com sucesso!";
		if(valor <= LIMITE_DEPOSITO) {
			saldo += valor;	
		}
		else {
			mensagem = "O valor do depósito não pode exceder " + LIMITE_DEPOSITO;
		}
		return mensagem;
		
	}
	
	/**
	 * Retira do saldo o valor recebido
	 * O valor deve ser <= 1000 de acordo com RN01 
	 * O cliente não pode sacar valor maior que o saldo da conta de acordo com RN02
	 * @param valor
	 */
	public String sacar(double valor) {
		
		String mensagem = "Saque realizado com sucesso!";
		
		if(valor <= LIMITE_SAQUE){
			if(valor <= saldo) {
				saldo -= valor;
			}
			else {
				mensagem = "Saldo insuficiente!";
			}
		}
		else {
			mensagem = "O saque não pode exceder " + LIMITE_SAQUE;
		}
		return mensagem;
		
	}
	
	/**
	 * realiza a transferência de valores entre contas
	 * @param c1 - conta a ser debitada
	 * @param c2 - conta a ser creditada
	 * @param valor - valor da transferência
	 */
	public static void transferir(Conta c1, Conta c2, double valor) {
		c2.saldo += valor;
		c1.saldo -= valor;
	}
}
