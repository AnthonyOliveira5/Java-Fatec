package semana06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
	
	public String ra, nome, curso;
	
	public Aluno() {
		
	}

	public Aluno(String ra, String nome, String curso) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
	}
	
	public String toString() {
		return "["+ra+","+nome+","+curso+"]";
	}
	
	/**
	 * grava em disco o estado atual do objeto
	 * também chamado de Persistência
	 * @return - o resultado da operação
	 */
	
	public String gravar() {
		String mensagem = "Objeto gravado com sucesso!";
		try {
			FileOutputStream fos = new FileOutputStream(ra+".obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this); //conteúdo do objeto atual
			oos.flush();
			oos.close();
		}
		catch(IOException erro) {
			mensagem = "Falha" + erro;
		}
		return mensagem;
	}
	public Aluno ler() {
		
		Aluno a = null;
		try {
			FileInputStream fos = new FileInputStream(ra+".obj");
			ObjectInputStream oos = new ObjectInputStream(fos);
			a = (Aluno)oos.readObject(); //conteúdo do objeto atual
			oos.close();
		}
		catch(Exception erro) {}
		return a;
	}
}
