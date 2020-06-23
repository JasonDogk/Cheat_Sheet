
public class MySecondCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7051399177730801191L;

	public MySecondCustomException() {
		super();
		System.out.println("My MySecondCustomException was thrown");
	}
}
