public class PaymentProcessor {

    private PaymentMethodFactory paymentMethodFactory;

    public PaymentProcessor(PaymentMethodFactory paymentMethodFactory) {
        this.paymentMethodFactory = paymentMethodFactory;
    }

    public void processPayment(CardTypes cardType , String cardHolder , double amount ,
                               String cardNumber , String cvv , String expiryDate ) {
        // logic of create card  +  processing

       PaymentMethod paymentMethod = paymentMethodFactory.createPaymentMethod( cardType ,  cardHolder ,  amount ,
         cardNumber ,  cvv ,  expiryDate);
        paymentMethod.authorizePayment();
        paymentMethod.startMoneyTransfer();
        paymentMethod.calculatePaymentFees(amount);
    }


}
