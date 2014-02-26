package main.shared;

public class Common {

	
	public static boolean checkIsDivisible(int x, int d) {
		if ( (x % d) == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEven(int x) {
		return checkIsDivisible(x, 2);
	}
}
