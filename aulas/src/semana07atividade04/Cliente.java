package semana07atividade04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Cliente implements Serializable {
	
	/**
	 * cpf - documento do cliente
	 * nome do cliente
	 * telefone do cliente
	 */
	private String cpf;
	private String nome;
	private String telefone;
	
	public Cliente() {	
	}
	
	public Cliente(String cpf) {
		this.cpf = cpf;
		
	}
	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public Cliente(String cpf, String nome, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + "]";
	}
	
	/**
	 * gravarCliente - grava o objeto em um arquivo .obj
	 * @return - retorna a mensagem se ocorreu corretamente a gravação ou não
	 */
	public String gravarCliente() {
		String mensagem = "Objeto gravado com sucesso!";
		try {
			FileOutputStream fos = new FileOutputStream(nome+".obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this); 
			oos.flush();
			oos.close();
		}
		catch(IOException erro) {
			mensagem = "Falha" + erro;
		}
		return mensagem;
	}
	
	/**
	 * ler cliente - Le o arquivo .obj gravado anteriormente
	 * @return retorna mensagem de erro caso dê algo errado
	 */
	public Cliente lerCliente() {
		
		Cliente a = null;
		try {
			FileInputStream fos = new FileInputStream(nome+".obj");
			ObjectInputStream oos = new ObjectInputStream(fos);
			a = (Cliente)oos.readObject(); 
			oos.close();
		}
		catch(Exception erro) {}
		return a;
	}
}
