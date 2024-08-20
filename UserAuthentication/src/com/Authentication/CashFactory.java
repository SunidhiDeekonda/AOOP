package com.Authentication;

public class CashFactory implements PaymentFactory{

	@Override
	public PaymentMethod createPaymentMethod() {
		// TODO Auto-generated method stub
        return new Cash();

	}

}
