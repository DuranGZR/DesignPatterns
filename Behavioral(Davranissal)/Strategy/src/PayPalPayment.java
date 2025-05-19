public class PayPalPayment implements PaymentStrategy{

    @Override
    public void pay(int para){
        System.out.println(para+ " TL paypal ile ödendi. ");
    }
}
