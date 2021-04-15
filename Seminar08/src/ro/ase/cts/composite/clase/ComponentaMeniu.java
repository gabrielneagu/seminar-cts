package ro.ase.cts.composite.clase;

public interface ComponentaMeniu {

	public void adaugaNod(ComponentaMeniu componentaMeniu);
	public void stergeNod(ComponentaMeniu componentaMeniu);
	public ComponentaMeniu getNod(int index);
	public void printeaza();
}
