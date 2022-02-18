package excepciones;

public class TechnicalException extends RuntimeException {
	public TechnicalException(String mensaje) {
		super(mensaje);
	}
	
	public TechnicalException(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
}
