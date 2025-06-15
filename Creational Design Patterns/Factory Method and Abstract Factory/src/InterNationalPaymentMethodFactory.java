public class InterNationalPaymentMethodFactory implements PaymentMethodFactory {

   public PaymentMethod createPaymentMethod(CardTypes cardType, String cardHolder , double amount ,
                                                         String cardNumber , String cvv , String expiryDate) {
       if (cardType == CardTypes.VISA) {
          return new Visa(cardHolder, cardNumber, cvv, expiryDate);
       } else if (cardType == CardTypes.MASTERCARD) {
           return new MasterCard(cardHolder, cardNumber, cvv, expiryDate);
       } else if (cardType == CardTypes.AMERICAN_EXPRESS) {
           return new AmericanExpress(cardHolder, cardNumber, cvv, expiryDate);
       } else {
           System.out.println("Invalid card type");
           return null;
       }
   }
}
