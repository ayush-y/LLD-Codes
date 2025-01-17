package EXAMPLE5.ProblematicCode;

public class MasterCardCreditCard extends CreditCard {
    @Override
    public void swipeAndPay() {
        System.out.println("Master card swipe and pay");
    }

    @Override
    public void doRefund() {
        System.out.println("Master card refund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Master card online payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Master card tap and pay");
    }

    // @Override
    // public void upiPayments() {
    //     System.out.println("Master card UPI payment");
    // }  
    @Override
    public void intlPayments() {
        System.out.println("Master card international payment");
    } 
    
}
