
public class BankAccount {
    private String name;
    private float balance = 0f;

    public BankAccount() {
    }

    public BankAccount(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float deposit(float amount) {
        balance += amount;
        return balance;
    }

    public float withdraw(float amount) {
        if (amount > balance) {
            System.out.println("There is not enough funds");
        } else balance -= amount;
        return balance;
    }

    public void printBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public float transferMoney(BankAccount transferTo, int amount) {
        if (amount > balance) {
            System.out.println("Transfer canceled. You are trying to transfer more money than are available.");
        } else transferTo.deposit(amount);
        withdraw(amount);
        return balance;
    }

//    public static void main(String[] args) {
//        BankAccount inga = new BankAccount("INGA");
//        BankAccount mia = new BankAccount("MI");
//        inga.deposit(2000);
//        mia.deposit(1000);
//        inga.withdraw(1000);
//        mia.withdraw(200);
//
//        inga.transferMoney(mia, 2000);
//
//        inga.printBalance();
//        mia.printBalance();
//    }
}
