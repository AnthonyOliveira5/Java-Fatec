package semana03;

public class Excecao02 {

	//Execução checked: é obrigatório tratar, da erro em tempo de compilação, antes de rodar o programa
	public static void main(String[] args) {
		String[] nomes = {"Anthony","Gabriel","Samuel"};
		//nomes[0] ="Anthony"...[0],[1],[2]

		try {
			for(int i=0; i<=3; i++) {
				System.out.println(nomes[i]);
				Thread.sleep(1000);
			}
		}
		catch(ArrayIndexOutOfBoundsException erro) {
			System.out.println("Índice inválido!!");
		}
		catch(InterruptedException erro) {
			System.out.println();
		}
		finally {
			//finalizar recursos
			System.out.println("Finalização do try");
		}
	}
}
