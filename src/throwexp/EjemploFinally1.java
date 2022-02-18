package throwexp;

public class EjemploFinally1 {
	
	public void hagoCosas(int a) throws MiException{
		Recurso rec = null;
		try {
			rec = obtenerRecurso();
			algoChido(rec);
			seguimos(rec);
		} finally {
			liberarRecursos(rec);
		}
		sigoConMiVida();	
	}

	private void resuelvoElProblema() {
		// TODO Auto-generated method stub
		
	}

	private void sigoConMiVida() {
		// TODO Auto-generated method stub
		
	}
	private void algoChido(Recurso rec) throws MiException {
		// TODO Auto-generated method stub
		
	}
	private void seguimos(Recurso rec) {
		// TODO Auto-generated method stub
		
	}
	private void liberarRecursos(Recurso rec) {
		// TODO Auto-generated method stub
		
	}

	private Recurso obtenerRecurso() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
