package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.FactoryPersonal;
import ro.ase.cts.simplefactory.clase.PersonalSpital;
import ro.ase.cts.simplefactory.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FactoryPersonal factoryPersonal = new FactoryPersonal();
			PersonalSpital medic = factoryPersonal.getPersonal(TipPersonal.MEDIC, "gabita");
			PersonalSpital asistent = factoryPersonal.getPersonal(TipPersonal.ASISTENT, "gabrielu");
			
			System.out.println(medic.toString());
			System.out.println(asistent.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
