package EXAMPLE5.ProblematicCode;

public class DinnersCreditCrad extends CreditCard {
    @Override
    public void swipeAndPay() {
        System.out.println("Dinners card swipe and pay");
    }

    @Override
    public void doRefund() {
        System.out.println("Dinners card refund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Dinners card online payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Dinners card tap and pay");
    }

    // @Override
    // public void upiPayments() {
    //     System.out.println("Dinners card UPI payment");
    // }
    @Override
    public void intlPayments() {
        System.out.println("Dinners card international payment");
    }
    
}
