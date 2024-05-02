package semana05;

import java.io.IOException;

public class UsaArquivo {
	
	public static void main(String[] args) {
		String s = Arquivo.leFrase("c:/temp/arquivo.txt");
		System.out.println(s);
		
		try {
			String s1 = Arquivo.leFrase2("c:/temp/arquivo.txt");
			System.out.println(s1);
		}
		catch(IOException e) {
			System.out.println("Falha ao abrir o arquivo!");
		}
	}
}
