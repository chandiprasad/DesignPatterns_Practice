package dp.creational.singleton;

public class DoubleCheckedSingleton {
	private static DoubleCheckedSingleton instance;

	private DoubleCheckedSingleton() {
	}

	public static DoubleCheckedSingleton getInstanceUsingDoubleLocking() {
		if (instance == null) { //1st check
			synchronized (DoubleCheckedSingleton.class) {
				if (instance == null) { //2nd check
					instance = new DoubleCheckedSingleton();
				}
			}
		}
		return instance;
	}
}
