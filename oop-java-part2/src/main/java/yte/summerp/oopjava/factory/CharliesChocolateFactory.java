package yte.summerp.oopjava.factory;

import java.util.HashMap;
import java.util.Set;

public class CharliesChocolateFactory implements ChocolateFactory {
	private static ChocolateFactory chocolateFactory;
	private HashMap<Class<? extends Chocolate>,Chocolate> chocolateMap=new HashMap<Class<? extends Chocolate>,Chocolate>();

	private CharliesChocolateFactory() {
	}

	public <T extends Chocolate> T createChocolate(int quantity, String chocolateType) {
		T chocolate=null;
		switch(chocolateType) {
			case ChocolateTypes.CHARLIES:
				Chocolate chocolate1=chocolateMap.get(CharliesSpecial.class);
				if(chocolate1==null) {
					chocolate1=(T) new CharliesSpecial();
					chocolateMap.put(CharliesSpecial.class,chocolate1);
				}
				chocolate = (T) chocolate1;
				break;
			case ChocolateTypes.GOLDEN_TICKET:
				chocolate1 = chocolateMap.get(GoldenTicketChocolate.class);
				if(chocolate1==null) {
					chocolate1 = (T) new GoldenTicketChocolate();
					chocolateMap.put(GoldenTicketChocolate.class,chocolate1);
				}
				chocolate = (T) chocolate1;
				break;
			case ChocolateTypes.MILKED:
				chocolate1 = chocolateMap.get(MilkChocolate.class);
				if(chocolate1==null) {
					chocolate1 = (T) new MilkChocolate();
					chocolateMap.put(MilkChocolate.class,chocolate1);
				}
				chocolate = (T) chocolate1;
				break;
			case ChocolateTypes.SQUARE:
				chocolate1 = chocolateMap.get(SquareChocolate.class);
				if(chocolate1==null) {
					chocolate1 = (T) new SquareChocolate();
					chocolateMap.put(SquareChocolate.class,chocolate1);
				}
				chocolate = (T) chocolate1;
				break;
			default:
				return null;
		}
		if(chocolate!=null)
			chocolate.addToStock(quantity);
		return chocolate;
	}

	@Override
	public int getTotalChocolateCount() {
		int total=0;
		Set<Class<? extends Chocolate>> keySet=chocolateMap.keySet();
		for(Class<? extends Chocolate> key:keySet) {
			total+=chocolateMap.get(key).getInStockQuantity();
		}
		return total;
	}

	@Override
	public <T> T getChocolatesOfType(Class<T> clazz) {
		return (T) chocolateMap.get(clazz);
	}

	public static ChocolateFactory getInstance() {
		if(chocolateFactory==null)
			chocolateFactory = new CharliesChocolateFactory();
		return chocolateFactory;
	}
}
