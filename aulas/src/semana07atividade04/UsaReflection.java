package semana07atividade04;

import java.io.IOException;

public class UsaReflection {

	 public static void main(String[] args) throws IOException, ClassNotFoundException {
	        String nomeClasse = "atividade04semana07.Televisao";

	        Reflection.analisarAtributos(nomeClasse);

	        System.out.println("Análise de atributos concluída!");
	   }
}
