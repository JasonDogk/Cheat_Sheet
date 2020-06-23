
public class MyCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6668187415553413092L;

	public MyCustomException() {
		System.out.println("MyCustomException was thrown with no parameters");
	}

	public MyCustomException(String msg) {
		System.out.println("MyCustomException was thrown with one string parameter : " + msg);
	}

	public MyCustomException(String msg, int criticality) {
		System.out.println("MyCustomException was thrown with one string and one int parameter");
		if (1 == criticality) {
			System.out.println("criticality is lowest lvl");
		} else if (2 == criticality) {
			System.out.println("criticality is low lvl");
		} else if (3 == criticality) {
			System.out.println("criticality is medium lvl");
		} else if (4 == criticality) {
			System.out.println("criticality is high lvl");
		} else if (5 == criticality) {
			System.out.println("criticality is highest lvl");
		} else {
			System.out.println("SYSTEM FAILURE");
		}
	}

}
