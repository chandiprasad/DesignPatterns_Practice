package dp.creational.singleton;

import java.io.Serializable;

public class ReadResolve4SerializedSingleton implements Serializable{
	private static final long serialVersionUID = -7604766932017737115L;

	private ReadResolve4SerializedSingleton() {
	}

	private static class ReadResolve4SerializedSingletonHelper {
		private static final ReadResolve4SerializedSingleton instance = new ReadResolve4SerializedSingleton();
	}

	public static ReadResolve4SerializedSingleton getInstance() {
		return ReadResolve4SerializedSingletonHelper.instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
}
