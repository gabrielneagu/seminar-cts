package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.ComponentaMeniu;
import ro.ase.cts.composite.clase.Element;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		ComponentaMeniu meniu = new Sectiune("meniu");
		ComponentaMeniu sectiuneBauturi = new Sectiune("alcooale");
		ComponentaMeniu sectiuneFelPrincipal = new Sectiune("mancaruri");
		
		ComponentaMeniu friptura = new Element("wagyu rib eye");
		ComponentaMeniu bere = new Element("timisoreana");
		ComponentaMeniu vin = new Element("busuioaca de bohotin");
		ComponentaMeniu garnitura = new Element("piure de cartofi cu trufe");
		
		sectiuneBauturi.adaugaNod(vin);
		sectiuneBauturi.adaugaNod(bere);
		
		sectiuneFelPrincipal.adaugaNod(friptura);
		sectiuneFelPrincipal.adaugaNod(garnitura);
		
		meniu.adaugaNod(sectiuneBauturi);
		meniu.adaugaNod(sectiuneFelPrincipal);
		
		meniu.printeaza();
		System.out.println();
		sectiuneBauturi.stergeNod(bere);
		sectiuneFelPrincipal.adaugaNod(bere);
		meniu.printeaza();
	}

}
