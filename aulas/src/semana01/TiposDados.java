package semana01;

public class TiposDados {

	public static void main(String[] args) {
		
		int a = 10;
		float nota = 7.8f;
		double d = 7.8;
		char c = 'A';
		byte bl = 127;
		System.out.println(a);
		double x = a;
		int y = (int)d;
		
		//classe
		String s = "Anthony";
		System.out.println(s.length());
		System.out.println(s);
		
		String v = "100"; //100
		
		int valor = Integer.parseInt(v);
		float nota1 = Float.parseFloat(v);
		double media = Double.parseDouble(v);
		
		String ss = String.valueOf(a);
		String sss = ""+a;
		
		

	}

}
