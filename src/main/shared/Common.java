package main.shared;

public class Common {

	public static boolean checkIsDivisible(long x, long d) {
		if ((x % d) == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEven(long x) {
		return checkIsDivisible(x, 2);
	}
}
