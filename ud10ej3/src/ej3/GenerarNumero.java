package ej3;

public class GenerarNumero {

	private int min;
	private int max;
	private int numeroAleatorio;
	private int intentos = 0;

	public GenerarNumero() {
		super();
		this.min = 1;
		this.max = 999;
	}

	public int generarNumero() {

		numeroAleatorio = (int) Math.floor(Math.random() * (0 - 500 + 1) + 500);
		return numeroAleatorio;

	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos += intentos;
	}

	
	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}

	public void setNumeroAleatorio(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}

	public void comprobarNumero(int numero) throws MiException {

		if (numeroAleatorio % 2 == 0) {
			throw new MiException(1);
		} else {
			throw new MiException(2);
		}
		

	}

}
