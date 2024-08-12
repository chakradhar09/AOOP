// Payment Methods
abstract class PaymentMethod {
    public abstract void pay(double amount);
}

class CreditCard extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPal extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class Cash extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash.");
    }
}

// Abstract Factory
interface PaymentMethodFactory {
    PaymentMethod createPaymentMethod();
}

// Concrete Factories
class CreditCardFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }
}

class PayPalFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPal();
    }
}

class CashFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new Cash();
    }
}
