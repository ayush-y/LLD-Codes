package EXAMPLE5.ProblematicCode;

public class RuayCardCredirCrad extends CreditCard {
    @Override
    public void swipeAndPay() {
        System.out.println("Ruay card swipe and pay");
    }

    @Override
    public void doRefund() {
        System.out.println("Ruay card refund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Ruay card online payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Ruay card tap and pay");
    }

    @Override
    public void upiPayments() {
        throw new UnsupportedOperationException("Ruay card UPI payment not supported");
    }   
    
}
