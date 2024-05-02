package semana03;

import java.text.DecimalFormat;

public class Arredondamento2 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat();

		df.applyPattern("##.00");
		for(int i = 1; i <= 10; i++) {
			double n = Math.random()*100;
			System.out.println(n + " --> " + df.format(n));

		}
	}
}
