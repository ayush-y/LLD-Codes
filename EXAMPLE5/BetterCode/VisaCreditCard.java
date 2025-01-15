package EXAMPLE5.BetterCode;

public class VisaCreditCard extends CreditCrad implements RefundCompatibleCreditCrad {

    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    //Getter and Setter methods
    public void swipeAndPay() {
        System.out.println("Payment done by swiping the card");
    }

    public void onlinePayment() {
        System.out.println("Payment done by online");
    }

    public void tapAndPay() {
        System.out.println("Payment done by tapping the card");
    }
    public void doRefund() {
        System.out.println("Refund done by Visa");
    }
    
}
