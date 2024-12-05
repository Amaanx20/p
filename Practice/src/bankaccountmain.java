public class bankaccountmain {
    public static void main(String[] args) {
        bankaccount account = new bankaccount("Alice", 1000);

        System.out.println("Inital Balence...£"+account.getBalence());

        account.deposit(400);
        account.deposit(700);
        account.Withdraw(200);
        account.Withdraw(100);
        account.deposit(900);
        account.deposit(500);
        account.Withdraw(20000);

    }
}
