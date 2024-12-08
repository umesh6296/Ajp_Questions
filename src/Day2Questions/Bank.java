package Day2Questions;

public class Bank {
    private double amount;
    public Bank(double amount) {
        this.amount = amount;
    }
 public void withdraw(double withdrawalAmount) {
       String result = (withdrawalAmount <= amount)
                ? "Withdrawal successful"
                : "Insufficient balance";

        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
        System.out.println(result);
    }

    // Method to deposit amount
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        Bank myBank = new Bank(10000);
        myBank.withdraw(3000);
        myBank.deposit(5000);
        myBank.displayBalance();
    }
}

