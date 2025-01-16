package StrategyPattern;

public class SameInstrumentRefundStrategy implements RefundStrategy {
    @Override
    public void doRefund() {
        System.out.println("Refund done using same instrument");
    }
    
}
