package EXAMPLE5.ProblematicCode;

public abstract class CreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    //Getter and Setter methods
    public abstract void swipeAndPay();
    public abstract void doRefund();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
    public abstract void upiPayments();
    public abstract void intlPayments();
}
