package dp.creational.abstractfactory;

import dp.creational.factory.Computer;

public class TestAbstractFactory {
	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		Computer laptop = ComputerFactory.getComputer(new LaptopFactory("32 GB", "1 TB", "2.9 GHz"));
		System.out.println("AbstractFactory PC Config::" + pc);
		System.out.println("AbstractFactory Server Config::" + server);
		System.out.println("AbstractFactory Laptop Config::" + laptop);
	}
}