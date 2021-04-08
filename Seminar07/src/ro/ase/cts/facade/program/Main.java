package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;

public class Main {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("1980909282201", "gabita magnificul");
		if (Facade.esteEligibil(persoana)) {
			System.out.println(persoana.getNume() + " este eligibil pentru credit");
		} else {
			System.out.println(persoana.getNume() + " nu este eligibil pentru credit");
		}
	}

}
