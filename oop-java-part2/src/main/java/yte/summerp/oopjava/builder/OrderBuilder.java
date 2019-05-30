package yte.summerp.oopjava.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {
	public OrderedItems preparePizzaOrder() throws IOException {
		OrderedItems itemsOrder=new OrderedItems();


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


		System.out.println(" Enter the choice of Pizza ");
		System.out.println("============================");
		System.out.println("        1. Veg-Pizza       ");
		System.out.println("        2. Non-Veg Pizza   ");
		System.out.println("        3. Exit            ");
		System.out.println("============================");

		int pizzaandcolddrinkchoice=Integer.parseInt(br.readLine());
		switch (pizzaandcolddrinkchoice) {

			case 1: {

				System.out.println("You ordered Veg Pizza");
				System.out.println("\n\n");

				System.out.println(" Enter the types of Veg-Pizza ");
				System.out.println("------------------------------");
				System.out.println("        1.Cheeze Pizza        ");
				System.out.println("        2.Mushroom Pizza        ");
				System.out.println("        3.Meaty Pizza        ");
				System.out.println("        4.Exit            ");
				System.out.println("------------------------------");

				int vegpizzachoice=Integer.parseInt(br.readLine());

				switch (vegpizzachoice) {

					case 1: {
						System.out.println("You ordered Cheeze Pizza");

						System.out.println("Enter the cheeze pizza size");
						System.out.println("------------------------------------");
						System.out.println("    1. Small Cheeze Pizza ");
						System.out.println("    2. Medium Cheeze Pizza ");
						System.out.println("    3. Large Cheeze Pizza ");
						System.out.println("    4. Extra-Large Cheeze Pizza ");
						System.out.println("------------------------------------");
						int cheezepizzasize=Integer.parseInt(br.readLine());
						switch (cheezepizzasize) {
							case 1:
								itemsOrder.addItem(new SmallCheezePizza());
								break;

							case 2:
								itemsOrder.addItem(new MediumCheezePizza());
								break;

							case 3:
								itemsOrder.addItem(new LargeCheezePizza());
								break;

							case 4:
								itemsOrder.addItem(new ExtraLargeCheezePizza());
								break;

						}

					}
					break;

					case 2: {

						System.out.println("You ordered Mushroom Eggs Pizza");

						System.out.println("Enter the pizza size");
						System.out.println("----------------------------------");
						System.out.println("    1. Small Mushroom Eggs Pizza ");
						System.out.println("    2. Medium Mushroom Eggs Pizza ");
						System.out.println("    3. Large Mushroom Eggs Pizza ");
						System.out.println("----------------------------------");
						int onionpizzasize=Integer.parseInt(br.readLine());
						switch (onionpizzasize) {
							case 1:
								itemsOrder.addItem(new SmallMushroomEggsPizza());
								break;

							case 2:
								itemsOrder.addItem(new MediumMushroomEggsPizza());
								break;

							case 3:
								itemsOrder.addItem(new LargeMushroomEggsPizza());
								break;
						}
					}
					break;

					case 3: {

						System.out.println("You ordered Meaty Pizza");

						System.out.println("Enter the Meaty pizza size");
						System.out.println("------------------------------------");
						System.out.println("    1. Small Mixed Pizza ");
						System.out.println("    2. Lahmacun ");
						System.out.println("    3. Karışık Pide ");
						System.out.println("    4. Extra-Large Mixed Pizza ");
						System.out.println("    5. Feed Meeeeee!!!!! ");
						System.out.println("------------------------------------");

						int masalapizzasize=Integer.parseInt(br.readLine());
						switch (masalapizzasize) {
							case 1:
								itemsOrder.addItem(new MixedPizza());
								break;

							case 2:
								itemsOrder.addItem(new TurkishPizza());
								break;

							case 3:
								itemsOrder.addItem(new MixedPide());
								break;

							case 4:
								itemsOrder.addItem(new LargeMixedPizza());
								break;
							case 5:
								itemsOrder.addItem(new TurkishPizza());
								itemsOrder.addItem(new TurkishPizza());
								itemsOrder.addItem(new TurkishPizza());
								itemsOrder.addItem(new MixedPide());
								itemsOrder.addItem(new LargeMixedPizza());
								break;

						}

					}
					break;

				}

			}
			break;// Veg- pizza choice completed.


			case 2: {

				System.out.println("You ordered Non-Veg Pizza");
				System.out.println("\n\n");

				System.out.println("Enter the Meaty pizza size");
				System.out.println("------------------------------------");
				System.out.println("    1. Small Mixed Pizza ");
				System.out.println("    2. Lahmacun ");
				System.out.println("    3. Karışık Pide ");
				System.out.println("    4. Extra-Large Mixed Pizza ");
				System.out.println("    5. Feed Meeeeee!!!!! ");
				System.out.println("------------------------------------");

				int masalapizzasize=Integer.parseInt(br.readLine());
				switch (masalapizzasize) {
					case 1:
						itemsOrder.addItem(new MixedPizza());
						break;

					case 2:
						itemsOrder.addItem(new TurkishPizza());
						break;

					case 3:
						itemsOrder.addItem(new MixedPide());
						break;

					case 4:
						itemsOrder.addItem(new LargeMixedPizza());
						break;
					case 5:
						itemsOrder.addItem(new TurkishPizza());
						itemsOrder.addItem(new TurkishPizza());
						itemsOrder.addItem(new TurkishPizza());
						itemsOrder.addItem(new MixedPide());
						itemsOrder.addItem(new LargeMixedPizza());
						break;

				}

			}
			break;

			default: {
				break;

			}


		}//end of main Switch


		System.out.println(" Enter the choice of ColdDrink ");
		System.out.println("============================");
		System.out.println("        1. Pepsi            ");
		System.out.println("        2. CocaCola             ");
		System.out.println("        3. Exit             ");
		System.out.println("============================");

		int coldDrink=Integer.parseInt(br.readLine());


		switch (coldDrink) {
			case 1: {
				System.out.println("You ordered Pepsi ");

				System.out.println("Enter the  Pepsi Size ");
				System.out.println("------------------------");
				System.out.println("    1. Small Pepsi ");
				System.out.println("    2. Medium Pepsi ");
				System.out.println("    3. Large Pepsi ");
				System.out.println("------------------------");


				int pepsisize=Integer.parseInt(br.readLine());
				switch (pepsisize) {
					case 1:
						itemsOrder.addItem(new SmallPepsi());
						break;

					case 2:
						itemsOrder.addItem(new MediumPepsi());
						break;

					case 3:
						itemsOrder.addItem(new LargePepsi());
						break;


				}

			}
			break;
			case 2: {

				System.out.println("You ordered CocaCola");

				System.out.println("Enter the CocaCola Size");
				System.out.println("------------------------");
				System.out.println("    1. Small CocaCola ");
				System.out.println("    2. Medium CocaCola  ");
				System.out.println("    3. Large CocaCola  ");
				System.out.println("    4. Extra-Large CocaCola ");
				System.out.println("------------------------");

				int cokesize=Integer.parseInt(br.readLine());
				switch (cokesize) {
					case 1:
						itemsOrder.addItem(new SmallCocaCola());
						break;

					case 2:
						itemsOrder.addItem(new MediumCocaCola());
						break;

					case 3:
						itemsOrder.addItem(new LargeCocaCola());
						break;


				}

			}
			break;

			default: {
				break;

			}


		}//End of the Cold-Drink switch

		return itemsOrder;

	}


}

