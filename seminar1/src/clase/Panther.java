package clase;

public class Panther extends Animal {

	private int age;
	
	public Panther(String name) {
		super(name);
		
	}

	public Panther(String name, int age) {
		super(name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
