package EXAMPLE5.ProblematicCode;

public class AmexCardCreditCard extends CreditCard {
    @Override
    public void swipeAndPay() {
        System.out.println("Amex card swipe and pay");
    }

    @Override
    public void doRefund() {
        System.out.println("Amex card refund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Amex card online payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Amex card tap and pay");
    }

    // @Override
    // public void upiPayments() {
    //     System.out.println("Amex card UPI payment");
    // }
    @Override
    public void intlPayments() {
        System.out.println("Amex card international payment");
    }   
    
}
