public class bankaccount {
    private String account_holder;
    private double balence;

    public bankaccount (String account_holder, double initalbalence) {
        this.account_holder = account_holder;
        if (initalbalence <= 0) {
            this.balence = initalbalence;
        }
        else {
            System.out.println("Overdraft not active balence cannot be lower than £0.00");
            this.balence = 0.00;
        }
    }
    public double getBalence() {
        return balence;
    }
    public void setAccount_holder(String account_holder) {
        this.account_holder = account_holder;
    }
    public String getAccount_holder() {
        return account_holder;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balence += amount;
            System.out.println("Deposited...£"+amount+ "  Current Balence...£"+balence);
        }else {
            System.out.println("Amount deposited must be postive...");
        }
    }
    public void Withdraw(double amount) {
        if (amount > 0)
        if (amount <= balence) {
            balence -= amount;
            System.out.println("Withdrew...£"+amount+"  Current Balence...£"+balence);
        }else {
            System.out.println("Insuffcient funds to withdraw amount...Current Balence is...£"+balence);
            }else {
            System.out.println("Amount must be postive...");
        }
    }
}
