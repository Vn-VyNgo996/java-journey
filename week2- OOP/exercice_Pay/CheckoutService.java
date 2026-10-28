package exercice_Pay;

public class CheckoutService {
    public void processOrder(PaymentMethod paymentMethod, double amount){
        System.out.println("Đang Chuẩn Bị Hóa Đơn");
        paymentMethod.pay(amount);
    }
}
