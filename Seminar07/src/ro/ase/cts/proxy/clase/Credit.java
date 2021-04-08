package ro.ase.cts.proxy.clase;

public class Credit implements CreditAbstract{

	@Override
	public void oferaCredit(TipMoneda moneda, float suma) {
		System.out.println("Creditul in valoare de "+suma+" "+moneda+" a fost aprobat");
	}

	
}
