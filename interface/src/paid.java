package Com.Interfaces;

public class PaidMain {
    public static void main(String[] args) {
        UPI upi = new UPI();
        CreditCard cc = new CreditCard();
        Cash c = new Cash();

        upi.payAmount(200);
        cc.payAmount(1400.02);
        c.payAmount(100);
    }
}
