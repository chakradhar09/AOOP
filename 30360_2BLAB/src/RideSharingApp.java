public class RideSharingApp {
    public static void main(String[] args) {
        UserAuthentication auth = UserAuthentication.getInstance();
        auth.login("john_doe");

        if (auth.isAuthenticated()) {
            System.out.println("Welcome " + auth.getUsername());

            // Request a vehicle
            VehicleFactory vehicleFactory = new VehicleFactory();
            Vehicle vehicle = vehicleFactory.createVehicle("Car");
            if (vehicle != null) {
                vehicle.ride();
            }

            // Choose a payment method
            PaymentMethodFactory paymentFactory = new CreditCardFactory();
            PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
            paymentMethod.pay(100.0);
        } else {
            System.out.println("Please log in to request a ride.");
        }

        auth.logout();
    }
}
