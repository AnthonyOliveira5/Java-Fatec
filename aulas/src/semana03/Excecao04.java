package semana03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Excecao04 {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("c:/temp/arquivo.txt");
			pw.println("Feliz dia das mulheres!");
			pw.println("Teste1");
			JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
			
			//adicionei dados
			pw.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Falha na criação do arquivo" + e);
			
		}
		finally {
			
		}

	}

}
