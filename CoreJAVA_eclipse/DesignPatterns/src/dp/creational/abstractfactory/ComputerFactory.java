package dp.creational.abstractfactory;

import dp.creational.factory.Computer;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}