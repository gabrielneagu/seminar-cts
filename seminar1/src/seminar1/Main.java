package seminar1;

import clase.Panther;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		Zebra zebra1 = new Zebra("gabrel");
		Zebra zebra2 = new Zebra("gabrela");
		zoo.addAnimal(zebra1);
		zoo.addAnimal(zebra2);
		
		zoo.feedAnimals();
		
		Panther panther1 = new Panther("pantera roz");
		Panther panther2 = new Panther("pantera alba",12);
		
		zoo.addAnimal(panther1);
		zoo.addAnimal(panther2);
		
		zoo.feedAnimals();
	}

}
