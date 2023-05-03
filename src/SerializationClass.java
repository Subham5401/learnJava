import java.io.*;

public class SerializationClass {
	
	public static void main(String args[]) {
		Emp emp = new Emp();
		emp.name = "Subham Mishra";
		emp.address = "Jamshedpur";
		
		try {
			FileOutputStream fileOut  = new FileOutputStream("char.txt");
			ObjectOutputStream	out = new ObjectOutputStream(fileOut);
			
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved!");
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
