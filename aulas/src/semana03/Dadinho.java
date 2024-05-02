package semana03;

public class Dadinho {

	public static void main(String[] args) {
		
		int a = 0,b = 0,c = 0,d = 0,e = 0,f = 0;
		
		for(int i = 1; i <=1000; i++) {
			
			int n = 1+(int)(Math.random()*6);
			
			switch(n) {
				case 1:a++;break;
				case 2:b++;break;
				case 3:c++;break;
				case 4:d++;break;
				case 5:e++;break;
				case 6:f++;break;
			}
			//System.out.println(n);
		}
		System.out.println("1: "+a);
		System.out.println("2: "+b);
		System.out.println("3: "+c);
		System.out.println("4: "+d);
		System.out.println("5: "+e);
		System.out.println("6: "+f);
	}

}
