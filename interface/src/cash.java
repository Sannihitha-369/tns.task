package Com.Interfaces;

public class Cash implements Account {
    @Override
    public void payAmount(double amount) {
        System.out.println(name + " paid by Cash: " + amount);
    }
}
