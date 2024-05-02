package semana06;

public class UsaMotor {

	public static void main(String[] args) {
		
		Motor motor = new Motor();
		
		motor.ligar();
		motor.mostrar();
		
		for(int a = 1; a <= 10000; a ++) {
			motor.acelerar();
		}
		motor.mostrar();
		
		for(int a = 1; a <= 10000; a ++) {
			motor.frear();
		}
		motor.mostrar();
	}
}
