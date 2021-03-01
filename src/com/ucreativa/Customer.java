/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public class Customer {

	public Customer() {
		
	}
	
	public static void main(String[] args) {
		Waiter Waiter1 = new Waiter();
		
		StarbucksBuilder teaBuilder = new TeaBuilder("Grande");
		Starbucks tea = new Starbucks();
		Waiter1.setStarbucksBuilder(teaBuilder);
		Waiter1.constructStarbucks();
		tea = Waiter1.getStarbucksDrink();
		
		StarbucksBuilder coffeeBuilder = new CoffeeBuilder("Frozen");
		Starbucks coffee = new Starbucks();
		Waiter1.setStarbucksBuilder(coffeeBuilder);
		Waiter1.constructStarbucks();
		coffee = Waiter1.getStarbucksDrink();
	}

}