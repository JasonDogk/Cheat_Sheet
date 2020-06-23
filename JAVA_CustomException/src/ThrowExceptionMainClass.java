
public class ThrowExceptionMainClass {

	public static void main(String[] args) throws MySecondCustomException {

		try {
			throw new MyCustomException();
		} catch (Exception e) {
			// TODO: handle exception
			// Do Nothing
		}

		try {
			throw new MyCustomException("This is a custom exception message to be displayed");
		} catch (Exception e) {
			// TODO: handle exception
			// Do Nothing
		}

		try {
			throw new MyCustomException("This is a custom exception message to be displayed", 1);
		} catch (Exception e) {
			// TODO: handle exception
			// Do Nothing
		}

		try {
			throw new MyCustomException("This is a custom exception message to be displayed", 5);
		} catch (Exception e) {
			// TODO: handle exception
			// Do Nothing
		}

		try {
			throw new MyCustomException("This is a custom exception message to be displayed", 10);
		} catch (Exception e) {
			// TODO: handle exception
			// Do Nothing
		}

		throw new MySecondCustomException();

	}

}
