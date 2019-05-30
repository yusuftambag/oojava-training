package yte.summerp.oopjava.factory;

public class ChocolateFactoryRunner {
	public static void main(String argv[]) {
		ChocolateFactory chocolateFactory=CharliesChocolateFactory.getInstance();
		chocolateFactory.createChocolate(50,ChocolateTypes.CHARLIES);
		chocolateFactory.createChocolate(25,ChocolateTypes.SQUARE);
		chocolateFactory.createChocolate(12,ChocolateTypes.GOLDEN_TICKET);
		chocolateFactory.createChocolate(37,ChocolateTypes.CHARLIES);
		chocolateFactory.createChocolate(44,ChocolateTypes.CHARLIES);
		chocolateFactory.createChocolate(19,ChocolateTypes.MILKED);
		chocolateFactory.createChocolate(70,ChocolateTypes.CHARLIES);
		chocolateFactory.createChocolate(32,ChocolateTypes.MILKED);
		chocolateFactory.createChocolate(57,ChocolateTypes.SQUARE);
		chocolateFactory.createChocolate(19,ChocolateTypes.SQUARE);
		chocolateFactory.createChocolate(13,ChocolateTypes.GOLDEN_TICKET);

		System.out.println("Total Chocolate count:"+chocolateFactory.getTotalChocolateCount());
		Class[] chocolateClasses={CharliesSpecial.class,MilkChocolate.class,GoldenTicketChocolate.class,SquareChocolate.class};

		for(Class clazz:chocolateClasses) {
			Chocolate chocolate=(Chocolate) chocolateFactory.getChocolatesOfType(clazz);
			if(chocolate==null)
				System.out.println("No chocolate for class: "+clazz);
			else
				System.out.println("Chocolate Name: "+chocolate.getName()+" Stock Quantity: "+chocolate.getInStockQuantity()+" Price: "+chocolate.getPrice());
		}
	}
}
