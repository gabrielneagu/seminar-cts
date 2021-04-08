package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.Credit;
import ro.ase.cts.proxy.clase.Proxy;
import ro.ase.cts.proxy.clase.TipMoneda;

public class Main {

	public static void main(String[] args) {
		Credit credit1 = new Credit();
		credit1.oferaCredit(TipMoneda.EUR, 5500);
		
		Proxy proxy = new Proxy(credit1);
		proxy.oferaCredit(TipMoneda.EUR, 1800);
		
		proxy.oferaCredit(TipMoneda.RON, 2200);
	}

}
