public interface PaymentMethodFactory {
    PaymentMethod createPaymentMethod(CardTypes cardType, String cardHolder , double amount ,
                                                   String cardNumber , String cvv , String expiryDate);
}
