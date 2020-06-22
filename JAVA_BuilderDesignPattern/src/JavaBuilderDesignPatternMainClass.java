// This is a typical example of a java Builder Design Pattern.
// All attributes in User.class have to be final in order not to be able to change after the first initialization of the object.
// Setters are also not allowed in order to make the object immutable.
// If you want to have attributes in User.class that are optional and not always required, you can make them by not using the final word in the UserBuilder class

public class JavaBuilderDesignPatternMainClass {

	public static void main(String[] args) {

		User user1 = new User.UserBuilder("John", "Smith").age(39).phone("+306972463857")
				.address("56 Burmingham Street").build();
		
		User user2 = new User.UserBuilder("Lara", "Croft").build();
		
		User user3 = new User.UserBuilder("Tim", "Barton").age(45).build();

		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);

	}

}
