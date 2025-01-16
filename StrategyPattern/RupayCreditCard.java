package StrategyPattern;

public class RupayCreditCard extends CreditCrad implements UpiCompatibleCreditCard, RefundCompatibleCreditCrad {

    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;    

    private RefundStrategy refundStrategy;

    public RupayCreditCard() {
        this.refundStrategy = new SameInstrumentRefundStrategy();
    }

    //Getter and Setter methods
    @Override
    public void swipeAndPay() {
        System.out.println("Payment done by swiping the card");
    }
    @Override
    public void onlinePayment() {
        System.out.println("Payment done by online");
    }
    @Override
    public void tapAndPay() {
        System.out.println("Payment done by tapping the card");
    }
    @Override
    public void upiPayments() {
        System.out.println("Payment done by UPI");
    }
    public void doRefund() {
        this.refundStrategy.doRefund();
    }

}
