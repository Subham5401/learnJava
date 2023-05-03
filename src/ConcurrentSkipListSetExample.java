import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExample {

	public static void main(String[] args) {
		ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
		
		set.add("John");
		set.add("Mary");
		set.add("Bob");
		set.add("Alice");
		
		System.out.println("Elements of the set: " + set);
		
		Thread t1 = new Thread(() -> {
			set.add("Mary");
			set.remove("Bob");
		});
		
		Thread t2 = new Thread(() -> {
			set.add("Sara");
			set.remove("Alice");
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Elements of the set after modification: " + set);

	}

}
