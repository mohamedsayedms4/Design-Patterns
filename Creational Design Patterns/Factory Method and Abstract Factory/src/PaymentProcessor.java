public class PaymentProcessor {


    public void processPayment(String cardType , String cardHolder , double amount ,
                               String cardNumber , String cvv , String expiryDate ) {
        // logic of create card  +  processing

        PaymentMethod paymentMethod = null;
        if (cardType.equalsIgnoreCase(CardTypes.VISA.toString())) {
            paymentMethod = new Visa(cardHolder,cardNumber,cvv,expiryDate);
        }else if (cardType.equalsIgnoreCase(CardTypes.MASTERCARD.toString())) {
            paymentMethod = new MasterCard(cardHolder,cardNumber,cvv,expiryDate);
        }else if (cardType.equalsIgnoreCase(CardTypes.AMERICAN_EXPRESS.toString())){
            paymentMethod = new AmericanExpress(cardHolder,cardNumber,cvv,expiryDate);
        }else {
            System.out.println("Invalid card type");
        }

        paymentMethod.authorizePayment();
        paymentMethod.startMoneyTransfer();
        paymentMethod.calculatePaymentFees(amount);
    }
}
