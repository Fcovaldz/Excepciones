package excepciones;

public class NegocioException extends Exception {
	private CodigoError errorCode;
	
	public CodigoError getErrorCode() {
		return errorCode;
	}

	public NegocioException(CodigoError errorCode, String detalleMsj, Throwable causa) {
		super(generarMensaje(errorCode, detalleMsj), causa);
		this.errorCode = errorCode;
	}
	
	private static String generarMensaje(CodigoError errorCode, String detalleMsj) {
		return errorCode + detalleMsj;
	}
	
	public CodigoError getCodigoError() {
		return errorCode;
	}
}

enum CodigoError {
	NEGATIVO("El numero ingresado es negativo"),
	PAR("El número ingresado es par");
	
	private String mensaje;
	
	CodigoError(String mensaje){
		this.mensaje = mensaje;
	}
	
	@Override
	public String toString() {
		return "FATAL ERROR" + mensaje + ". Detalles: ";
	}
}