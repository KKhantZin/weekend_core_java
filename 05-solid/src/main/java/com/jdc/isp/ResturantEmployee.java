package com.jdc.isp;

public class ResturantEmployee {
	public static void main(String[] args) {
		Resturant rest = new Resturant();
		
		Waiter wa = new Waiter();
		Chef ch = new Chef();
		DeliveryPerson dp = new DeliveryPerson();
		Manager man =  new Manager();
		
		System.out.println("Assigning Tasks");
		System.out.println("***************");
		rest.assignCooking(ch);
		rest.assignWork(wa);
		rest.assignDelivery(dp);
		rest.assignInventoryManage(man);
		
	}
}

class Resturant {
	public void assignWork(Servable servant) {
		servant.serveFood();
	}
	public void assignCooking(Cookable cook) {
		cook.cookFood();
	}
	public void assignDelivery(Deliverable deliver) {
		deliver.deliveryFood();
	}
	public void assignInventoryManage(Managable manager) {
		manager.manageInventory();
	}
}

interface Servable {
	void serveFood();		// for waiter
}

interface Cookable {
	void cookFood();		// for chef
}

interface Deliverable {
	void deliveryFood(); 	// for deliveryPerson
}

interface Managable {
	void manageInventory();	// for manager
}

class Manager implements Managable {

	@Override
	public void manageInventory() {
		System.out.println("Manager is managing resturant inventory.");
	}
	
}

class DeliveryPerson implements Deliverable {

	@Override
	public void deliveryFood() {
		System.out.println("Delivery Person is delivering food to customers.");
	}
	
}

class Chef implements Cookable {

	@Override
	public void cookFood() {
		System.out.println("Chef is cooking delicious food.");
	}
	
}
class Waiter implements Servable {

	@Override
	public void serveFood() {
		System.out.println("Waiter is serving food to customers.");
	}
	
}