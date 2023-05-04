
public class Generics<T> {
	T thingToPrint;
	
	public Generics (T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void printer() {
		System.out.println(thingToPrint);
	}
}
 