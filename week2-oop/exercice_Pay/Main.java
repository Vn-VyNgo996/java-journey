package exercice_Pay;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService();

        PaymentMethod cash = new CashPayment();
        PaymentMethod carh = new CardPayment();
        checkoutService.processOrder(cash, 5000);
        checkoutService.processOrder(carh, 2000);
    }
}
