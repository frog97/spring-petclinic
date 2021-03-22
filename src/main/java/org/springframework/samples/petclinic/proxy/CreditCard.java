package org.springframework.samples.petclinic.proxy;

public class CreditCard implements Payment{
	Cash cash = new Cash();

	@Override
	public void pay(int amount) {
		if ( amount > 100) {
			System.out.println(amount + " credit cart payment");
		} else {
			cash.pay(amount);
		}
	}
}

