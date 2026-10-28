package exercice_Pay;

public class CashPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Thanh Toán Thành Công " + amount + " VND bằng tiền mặt");
    }
}
