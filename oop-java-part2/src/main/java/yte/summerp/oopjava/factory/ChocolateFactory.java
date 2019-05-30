package yte.summerp.oopjava.factory;

public interface ChocolateFactory {
	public <T extends Chocolate> T createChocolate(int quantity,String chocolateType);

	public int getTotalChocolateCount();

	public <T> T getChocolatesOfType(Class<T> clazz);
}
