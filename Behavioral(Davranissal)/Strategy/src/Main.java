
public class Main {
    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setStrategy(new PayPalPayment());
        context.executePayment(100);

        context.setStrategy(new CreditCardPayment());
        context.executePayment(200);
    }
}