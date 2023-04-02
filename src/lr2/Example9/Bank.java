package lr2.Example9;

public class Bank implements BankAccount {

    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("На счёте недостаточно средств для выполнения операции.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
