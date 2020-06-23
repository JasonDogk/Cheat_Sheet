
public class UtilLib {
	
	public static boolean isEmpty(Object object) {

		if (object != null) {
			if (object instanceof String) {
				String str = (String) object;
				if ("".equals(str.trim()))
					return true;
			}
			return false;
		}
		return true;
	}

}
