package exercice_Pay;

public class CardPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Thành Toán Thành Công " + amount + " VND bằng thẻ tín dụng");
    }
}
