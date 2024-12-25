class Account {
    private double balance;

    //no-argument constructor
    public Account() {
        this.balance = 0.0; // Default balance
    }
    //constructor with two arguments (initial balance and deposit)
    public Account(double balance, double initialDeposit) {
        if (balance < 0 || initialDeposit < 0) {
            System.out.println("Initial values cannot be negative.");
            this.balance = 0.0;
        } else {
            this.balance = balance + initialDeposit;
        }
    }
    //method to deposit the amount to the account
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Successfully deposited: "+amount);
        }
    }

    //method to withdraw the amount from the account
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: "+amount);
        }
    }
    //method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: " +balance);
    }
}
class Solution3 {
    //main method
    public static void main(String[] args) {
        //Creating an account using no-argument
        Account account1 = new Account();
        account1.displayBalance();
        account1.deposit(500);
        account1.withdraw(200);
        account1.displayBalance();

        //creating an account with initial balance and deposit
        Account account2 = new Account(1000, 500);
        account2.displayBalance();
        account2.deposit(300);
        account2.withdraw(1200);
        account2.displayBalance();
    }
}
