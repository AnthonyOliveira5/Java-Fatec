package semana05;

public class Recursividade {
	
	public static void somatoria(int n) {//5
		//5+4+3+2+1
		
		int total = 0;
		
		for(int i=1; i<=n; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
	public static int somatoriaRecursiva(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n + somatoriaRecursiva(n-1);
		}
	}
	public static void main(String[] args) {
		somatoria(10);
		System.out.println(somatoriaRecursiva(10));
	}
}

