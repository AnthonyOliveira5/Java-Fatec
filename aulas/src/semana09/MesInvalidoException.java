package semana09;

// Exceção checked = Exception
// Exceção unchecked = runtimeException

public class MesInvalidoException extends Exception{
	
	public MesInvalidoException(String mensagem) {
		super(mensagem);
	}
}
