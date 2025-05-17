public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(int para){
        System.out.println(para+ "TL kredi kartı ile ödendi");
    }

}
