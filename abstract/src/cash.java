package Com.Interfaces;

public class Cash implements Account{
    @Override
    public void payAmount(double amount) {
        System.out.println(name+" successfully paid by Cash");
        System.out.println("The amount is: "+amount);
    }
}
