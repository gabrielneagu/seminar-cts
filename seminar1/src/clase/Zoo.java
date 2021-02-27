package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private Zookeeper zookeeper;
	private List<Animal> animale;
	
	public Zoo(Zookeeper zookeeper, List<Animal> animale) {
		super();
		this.zookeeper = zookeeper;
		this.animale = animale;
	}
	
	public Zoo() {
		super();
		this.zookeeper = new Zookeeper("gabita");
		this.animale = new ArrayList<>();
	}
	
	public void addAnimal(Animal a) {
		animale.add(a);
	}
	
	public void feedAnimals() {
		for(Animal a : animale) {
			zookeeper.feed(a);
		}
	}
}
