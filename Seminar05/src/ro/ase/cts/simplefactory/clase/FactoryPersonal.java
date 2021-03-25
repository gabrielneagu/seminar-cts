package ro.ase.cts.simplefactory.clase;

public class FactoryPersonal {

	public PersonalSpital getPersonal(TipPersonal tip, String nume) throws Exception {
		switch (tip) {
		case MEDIC:
			return new Medic(nume);
		case ASISTENT:
			return new Asistent(nume);
		case BRANCARDIER:
			return new Brancardier(nume);
		default:
			throw new Exception();
		}
	}
}
