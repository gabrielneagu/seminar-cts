package ro.ase.cts.adapterclase.program;

import ro.ase.cts.adapterclase.clase.AdapterCreditClase;
import ro.ase.cts.adapterclase.clase.CreditAbstract;

public class Main {

	public static void afiseazaInfoCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {

		AdapterCreditClase adaptor = new AdapterCreditClase(2500, "vanatorul");
		afiseazaInfoCredit(adaptor);
	}

}
