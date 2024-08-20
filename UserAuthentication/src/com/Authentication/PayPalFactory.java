package com.Authentication;

public class PayPalFactory implements PaymentFactory {

	@Override
	public PaymentMethod createPaymentMethod() {
		// TODO Auto-generated method stub
        return new PayPal();
	}

}
