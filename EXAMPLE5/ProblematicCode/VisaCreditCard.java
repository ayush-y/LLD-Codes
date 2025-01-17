package EXAMPLE5.ProblematicCode;

public class VisaCreditCard extends CreditCard {
    @Override
    public void swipeAndPay() {
        System.out.println("Visa card swipe and pay");
    }

    @Override
    public void doRefund() {
        System.out.println("Visa card refund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Visa card online payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Visa card tap and pay");
    }

    // @Override
    // public void upiPayments() {
    //     System.out.println("Visa card UPI payment");
    // }  
    @Override 
    public void intlPayments() {
        System.out.println("Visa card international payment");
    }
}
