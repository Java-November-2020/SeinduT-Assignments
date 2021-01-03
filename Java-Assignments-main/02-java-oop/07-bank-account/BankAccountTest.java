public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount BA = new BankAccount();
        BA.displayAccountBalance();

        System.out.println("Making deposits");
        BA.depositMoney("checking", 10000);
        BA.depositMoney("savings", 50000);
        
        System.out.println("New update!");
        BA.displayAccountBalance();

        BA.withdrawMoney("checking", 6500);
        BA.withdrawMoney("savings", 15000);
        
        System.out.println("New update!");       
        BA.displayAccountBalance();
        
        System.out.println("Current balance for all account is $" + BankAccount.allAccountBalances);
    }
}