package com.Authentication;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        UserAuthentication userAuth = UserAuthentication.getInstance();
		        userAuth.login();

		        if (userAuth.isAuthenticated()) {
		            // Create and use vehicles
		            Vehicle car = VehicleFactory.createVehicle("Car");
		            car.ride();

		            Vehicle bike = VehicleFactory.createVehicle("Bike");
		            bike.ride();

		            // Create and use payment methods
		            PaymentFactory paymentFactory = new CreditCardFactory();
		            PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
		            paymentMethod.pay();

		            paymentFactory = new PayPalFactory();
		            paymentMethod = paymentFactory.createPaymentMethod();
		            paymentMethod.pay();
		        }

		        userAuth.logout();
		    }
		
	}
