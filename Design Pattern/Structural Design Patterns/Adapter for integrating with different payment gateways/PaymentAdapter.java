public class PaymentAdapter {
    private PaymentProcessor processor;

    public PaymentAdapter(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void pay(double amount) {
        processor.processPayment(amount);
    }
}
