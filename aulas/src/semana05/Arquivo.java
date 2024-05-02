package semana05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {
	
	/**
	 * Realiza a leitura de um arquivo texto e retorna 
	 * uma String contendo seu conteúdo
	 * @param path - caminho e nome do arquivo
	 * @return - o conteúdo do arquivo
	 */
	public static String leFrase(String path) {
		BufferedReader br = null;
		String retorno = "";
		try {
			br = new BufferedReader( new FileReader(path));
			retorno = br.readLine();
		} catch (IOException e) {
			retorno = "Falha ao abrir o arquivo!";
		}
		return retorno;
	}
	
	public static String leFrase2(String path) throws IOException {
		BufferedReader br = null;
		br = new BufferedReader( new FileReader(path));
		String s = br.readLine();
		br.close();
		return s;
	}
}
