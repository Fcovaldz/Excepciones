package throwexp;

public class ThrowEjemplo{

	public static void main(String[] args) {
		String queonda = "¡Que onda!";
		
		queonda.charAt(100);
		
		new Integer("x"); 

	}
	
	private void yoNoSeTratarla() throws MiException {
		yoLanzoUnaExcepcion();
	}

	private void yoLanzoUnaExcepcion() throws MiException{
		throw new MiException("FAIL");
		
	}

}
