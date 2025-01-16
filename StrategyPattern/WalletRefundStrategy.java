package StrategyPattern;

public class WalletRefundStrategy implements RefundStrategy {
    @Override
    public void doRefund() {
        System.out.println("Refund done using Wallet");
    }

}
