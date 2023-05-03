import java.io.Serializable;

public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;
	String address;
}

//Notes:

// 1. The serialVersionUID is a unique identifier that is used during the serialization and 
//    deserialization process to ensure that the same version of the class is being used. If you don't specify the serialVersionUID, 
//    the JVM generates one based on the structure of the class, 
//    and this can cause issues when you try to deserialize an object that was serialized using a different version of the class.

// 2. If a sender serializes an object and sends it to a receiver who has a different version of the class with a different serialVersionUID, 
//    the deserialization process will fail with an InvalidClassException. 