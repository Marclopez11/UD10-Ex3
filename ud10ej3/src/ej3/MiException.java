package ej3;

public class MiException extends Exception {

	private int codigoException;

	public MiException(int codigoException) {
		super();
		this.codigoException = codigoException;
	}

	@Override
	public String getMessage() {

		String mensaje = "";
		switch (codigoException) {
		case 1:
			 mensaje = "Exception capturada con mensaje: Es par ";
			 break;
			 
		case 2:
			 mensaje = "Exception capturada con mensaje: Es impar ";
			 break;
		default:
			
		}
		return mensaje;

	}

}
