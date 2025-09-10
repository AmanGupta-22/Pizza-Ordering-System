package main;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pizza basePizza= new Pizza(true);
//		basePizza.addExtraCheese();
//		basePizza.addExtraToppings();
//		basePizza.takeAway();
//		basePizza.getBill();
		
		DeluxPizza dp =new DeluxPizza(true);
		dp.addExtraCheese();
    	dp.addExtraToppings();
    	dp.takeAway();
		dp.getBill();

	}

}
