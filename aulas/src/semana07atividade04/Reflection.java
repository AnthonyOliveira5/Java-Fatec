package semana07atividade04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflection {
	
    public static void analisarAtributos(String nomeClasse) throws ClassNotFoundException, IOException {
        Class classe = Class.forName(nomeClasse);

        Field[] campos = classe.getDeclaredFields();

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("teste.txt"))) {
            escritor.write("Análise de Atributos da Classe: " + nomeClasse + "\n\n");

            for (Field campo : campos) {
                escritor.write("Nome: " + campo.getName() + "\n");
                escritor.write("Tipo: " + campo.getType().getSimpleName() + "\n");
                escritor.write("Modificadores: " + obterModificadores(campo.getModifiers()) + "\n\n");
            }
        }
    }

    private static String obterModificadores(int modificadores) {
        StringBuilder modificadoresTexto = new StringBuilder();

        if (Modifier.isPublic(modificadores)) {
            modificadoresTexto.append("public ");
        }

        if (Modifier.isPrivate(modificadores)) {
            modificadoresTexto.append("private ");
        }

        if (Modifier.isStatic(modificadores)) {
            modificadoresTexto.append("static ");
        }

        if (Modifier.isFinal(modificadores)) {
            modificadoresTexto.append("final ");
        }

        if (Modifier.isTransient(modificadores)) {
            modificadoresTexto.append("transient ");
        }

        if (Modifier.isVolatile(modificadores)) {
            modificadoresTexto.append("volatile ");
        }

        return modificadoresTexto.toString().trim();
    }
}

