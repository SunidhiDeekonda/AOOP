package com.Authentication;

public class CreditCardFactory implements PaymentFactory{

	@Override
	public PaymentMethod createPaymentMethod() {
		// TODO Auto-generated method stub
        return new CreditCard();

	}

}
