import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		System.out.println("Initial Map: " + map);
		
		new Thread(() -> map.put("D", 4)).start();
		new Thread(() -> map.put("E", 5)).start();
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Updated Map: " + map);

	}

}

// Notes:
// 1. thread safety in a ConcurrentHashMap is achieved not by blocking threads, but by dividing the map into partitions and 
//    using locks to ensure that multiple threads can update different partitions simultaneously without interfering with each other.
