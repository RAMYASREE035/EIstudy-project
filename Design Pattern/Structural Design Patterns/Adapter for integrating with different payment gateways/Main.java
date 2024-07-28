public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalProcessor();
        PaymentProcessor stripeProcessor = new StripeProcessor();

        PaymentAdapter paypalAdapter = new PaymentAdapter(paypalProcessor);
        PaymentAdapter stripeAdapter = new PaymentAdapter(stripeProcessor);

        paypalAdapter.pay(100.00);
        stripeAdapter.pay(200.00);
    }
}
