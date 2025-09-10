package main;

public class Pizza {
	private int price;
	private Boolean veg;
	private int basePizzaPrice;
	private Boolean isAddExtraCheese=false;
	private Boolean isAddExtraToppings=false;
	private Boolean isOpterForTakeAway=false;
	
	
	public Pizza(Boolean veg) {
		this.veg = veg;
		if(this.veg)
		{
			this.price=300;
		}
		else
		{
			this.price=400;
		}
		basePizzaPrice=this.price;
	}
	
//	public void getPizzaPrice() {
//		System.out.println(this.price);
//	}
	
	public void addExtraCheese() {
		isAddExtraCheese=true;
		this.price=this.price+100;
		
	}
    public void addExtraToppings() {
    	isAddExtraToppings=true;
    	this.price=this.price+150;
	}
    public void takeAway() {
    	isOpterForTakeAway=true;
    	this.price=this.price+20;
		
	}
    public void getBill() {
    	String bill ="";
    	System.out.println("Base Pizza Price: "+basePizzaPrice);
    	if(isAddExtraCheese) {
    		bill=bill+"Extra Cheese added: "+100+"\n";
    	}
    	if(isAddExtraToppings) {
    		bill=bill+"Your Extra Toppings added: "+150+"\n";
    	}
    	if(isOpterForTakeAway) {
    		bill=bill+"Take Away opted: "+20+"\n";
    	}
    	bill= bill+"Your Total Bill is: "+this.price;
    	System.out.println(bill);
    	System.out.println("Thank you for shopping");
    	
		
	}
	

}
