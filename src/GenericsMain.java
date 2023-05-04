import java.util.*;

public class GenericsMain {
	
	// Generic Method
	public static <T> void myGenericMethod(T data) {
		System.out.println(data);
	}
	
	// Wild Card Characters
	// List can contain object that is sub-type of Number, including,
	// Integer, Double and Float
	public static void wildCard(List<? extends Number> myList) {
		System.out.println(myList);
	}
	
	public static void main(String args []) {
		
		Generics<Integer> gen1 = new Generics<>(20);
		Generics<Double> gen2 = new Generics<>(20.55);
		
		gen1.printer();
		gen2.printer();
		
		myGenericMethod("SM");
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(11);
		myList.add(12);
		
		wildCard(myList);
		
	}
}
