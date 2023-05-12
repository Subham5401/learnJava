import java.util.InputMismatchException;
import java.util.Scanner;

public class Project1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		String name = "", color = "";
		
		try {
			System.out.print("Enter your name: ");
			if(sc.hasNext()) {
				name = sc.next();
			}
			
			
			System.out.print("Enter your age: ");
			if(sc.hasNextInt()) {
				age = sc.nextInt();
				sc.nextLine();
			}
			else {
				sc.close();
				throw new InputMismatchException("Invalid input. Please enter an integer.");
			}
			
			System.out.print("Enter your fav color: ");
			if(sc.hasNext()) {
				color = sc.next();
			}
			
			sc.close();
			System.out.println("Your name is " + name + ", your age is " + age + " and your fav color is " + color);
			
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
}
