package ro.ase.cts.decorator.clase;

public class NotaDePlata implements NotaAbstracta {

	private float suma;

	public NotaDePlata(float suma) {
		super();
		this.suma = suma;
	}

	@Override
	public void printeaza() {
		System.out.println("Total de plata: " + suma + " lei");
	}

}
