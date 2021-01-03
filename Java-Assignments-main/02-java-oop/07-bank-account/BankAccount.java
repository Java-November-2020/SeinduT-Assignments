import java.util.Random;

public class BankAccount {
    
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    public static int numOfAccounts = 0;
    public static double allAccountBalances = 0;

    private static String generateAccountNumber(){
        String temp = "";
        Random n = new Random();
        for (int i = 0; i < 10; i++) {
            temp += n.nextInt(10);
        }
        return temp;
    }

    public BankAccount() {
        BankAccount.numOfAccounts += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = BankAccount.generateAccountNumber();
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void depositMoney(String account, double amount) {
        if (account.equals("checking"))
            this.checkingBalance += amount;
        else if (account.equals("savings"))
            this.savingsBalance += amount;
        BankAccount.allAccountBalances += amount;
    }

    public void withdrawMoney(String account, double amount) {
        if (account.equals("checking")) {
            if (this.checkingBalance >= 0) {
                this.checkingBalance -= amount;
                this.allAccountBalances -= amount;
            }
            else {
                System.out.println("Unable to complete Withdrawal due to insufficient funds");
            }
        }
        else if (account.equals("savings")) {
            if (this.savingsBalance >= 0) {
                this.savingsBalance -= amount;
                this.allAccountBalances -= amount;
            }
            else {
                System.out.println("Unable to complete Withdrawal due to insufficient funds");
            }
        }
    }

    public void displayAccountBalance() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Checking Account Balance: " + this.checkingBalance);
        System.out.println("Savings Account Balance: " + this.savingsBalance);
    }
}