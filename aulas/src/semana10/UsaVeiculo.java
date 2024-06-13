package semana10;

public class UsaVeiculo {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.id = 1;
		veiculo.modelo = "Fusca";
		veiculo.ano = 1969;
		
		Motor motor = new Motor();
		motor.descricao = "100 cv potência";
		veiculo.adicionarMotor(motor);//agregação
		
		Lampada lampada = new Lampada();
		veiculo.adicionarLampada(lampada);//agregação
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.adicionarMotor(motor);
		
	}

}
