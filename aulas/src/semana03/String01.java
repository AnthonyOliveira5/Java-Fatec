package semana03;

public class String01 {

	public static void main(String[] args) throws InterruptedException {
		String s = "Subi no onibus";
		System.out.println(s.length());
		for(int i = 0; i < s.length();i++) {
			System.out.print(s.charAt(i));
			Thread.sleep(500);
		}
		System.out.println();
		for(int i = s.length() - 1; i >= 0;i--) {
			System.out.print(s.charAt(i));
			Thread.sleep(500);
		}
	}
}
