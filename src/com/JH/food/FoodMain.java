package com.JH.food;



public class FoodMain {
	
	public static void main(String[] args) {
		FoodInput fi = new FoodInput();
		Order order = new Order();
		
		
		Food[] AB = fi.foodinput();
		order.order(AB);
	
	}

}
