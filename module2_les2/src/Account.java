
import java.util.UUID;

public class Account {
    private UUID id;
    private String name;
    private int balance;

    public Account(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public Account(String name, int balance) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.balance = balance;
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return balance += amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount exceeded balance" );
        }
        return  balance ;
    }

    public boolean transferTo( Account account,int amount ){
        if (amount <= balance) {
            this.balance-=amount;
            account.credit(amount);
            return true;
        } else {
            System.out.println("Insufficient funds to transfer " + amount);
        }
        return false;

    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Account account1 = new Account("Alice", 1000);
        Account account2 = new Account("Bob", 500);

        System.out.println("Before Transfer:");
        System.out.println("Account 1: " + account1);
        System.out.println("Account 2: " + account2);

        account1.transferTo(account2, 200);

        System.out.println("\nAfter Transfer:");
        System.out.println("Account 1: " + account1);
        System.out.println("Account 2: " + account2);
    }
}