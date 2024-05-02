package semana04;

public class Calculos {
	
	/**
	 * Recebe 2 valores inteiros e apresenta sua soma em tela
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 */
	public static void somar(int a, int b) {
		System.out.println(a+b);	

	}
	
	/**
	 *	Recebe três valores inteiros e apresenta sua soma em tela
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 * @param c - terceiro valor
	 */
	public static void somar(int a, int b, int c) {
		System.out.println(a+b+c);

	}
	
	public static void somar(double a, double b, double c) {
		System.out.println(a+b+c);
		
	}
	public static void somar(int i, int j, int k, int l, int m) {
		System.out.println(i+j+k+l+m);
		
	}
	public static void somar(double d, double e, int k, int l, int m) {
		System.out.println(d+e+k+l+m);
		
	}

}


//Sobrecarga(OverLoad) - indica a possibilidade de eu declarar na mesma classe metodos com mesmo nome
//na mesma classe, é possível declarar métodos com o mesmo nome
//porém assinaturas diferentes(parametros)
//exemplo: println()
//Métodos devem seguir o padrão e serem documentados
//IMPORTANTE Para quem "consome" o método
// /** permite gerar a documentação