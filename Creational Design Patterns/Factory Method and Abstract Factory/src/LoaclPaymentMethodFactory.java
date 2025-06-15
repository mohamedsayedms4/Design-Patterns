public class LoaclPaymentMethodFactory implements PaymentMethodFactory {

    @Override
    public PaymentMethod createPaymentMethod(CardTypes cardType, String cardHolder, double amount, String cardNumber, String cvv, String expiryDate) {
        if (cardType == CardTypes.ALEXBANK) {
            return new Alex(cardHolder, cardNumber, cvv, expiryDate);
        } else if (cardType == CardTypes.QNB) {
            return new Qnb(cardHolder, cardNumber, cvv, expiryDate);
        }else {
            return null;
        }
    }
}
