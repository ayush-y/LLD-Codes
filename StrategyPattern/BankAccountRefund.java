package StrategyPattern;

public class BankAccountRefund implements RefundStrategy {
    @Override
    public void doRefund() {
        System.out.println("Refund done via Bank Account");
    }
    
}
