
public class SingleObject {

	// Create an object of SingleObject
	private static SingleObject instance = new SingleObject();

	// Make the constructor private so that this class cannot be instantiated
	private SingleObject() {
	}

	// Get the only available object
	public static SingleObject getInstance() {
		return instance;
	}

	public void sayHello() {
		System.out.println("Hello my friend!!!");
	}
}
