/**
 * @author iampa
 * */
package throwexp;

public class TryCatch {

	private void sinMentiras(boolean esCierto) throws MiException {
		if (!esCierto) {
			throw new MiException("natekreooo!!");
		}
	}
	
	private void yoJalo(boolean algo) {
		try {
			sinMentiras(algo);
		} catch (MiException e) {
			denunciarMentiras();
		}
	}

	private void denunciarMentiras() {
		System.out.println("No me mientas 7.7");
	}
}
