
public class SingletonPatternDemo {

	public static void main(String[] args) {

		// illegal constructor
		// Compile time error, The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();

		SingleObject object = SingleObject.getInstance();

		object.sayHello();

	}

}
