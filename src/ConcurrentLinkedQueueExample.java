import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {

	public static void main(String[] args) throws InterruptedException {
		ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
		
		queue.add("apple");
		queue.add("banana");
		queue.add("cherry");
		
		System.out.println("Elements in the queue: " + queue);
		
		String removedElement  = queue.poll();
		System.out.println("Removed Element: " + removedElement);
		
		System.out.println("Element in the queue after removal: " + queue);
		
		queue.add("date");
		
		System.out.println("Elements in the queue after addition: " + queue);
	}

}
