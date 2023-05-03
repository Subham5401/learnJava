import java.io.*;

public class DeserializationClass {
	public static void main(String[] arg) throws IOException, ClassNotFoundException, InvalidClassException{
		Emp emp = null;
		
		try {
			FileInputStream fileIn = new FileInputStream("char.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			emp = (Emp) in.readObject();
			in.close();
			fileIn.close();
		}
		finally {
			System.out.println("Deserializing Employee..");
			System.out.println("Employee Name: " + emp.name);
			System.out.println("Employee Adress: " + emp.address);
		}
	}
}
