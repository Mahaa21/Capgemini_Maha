import java.util.*;

class Cust {
    private String name;
    private String customerId;
    private double balance;

    public Cust(String name, String customerId, double initialDeposit) {
        this.name = name;
        this.customerId = customerId;
        this.balance = initialDeposit;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(name + " withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance for " + name);
        }
    }

    public void viewBalance() {
        System.out.println("Customer: " + name + " | ID: " + customerId + " | Balance: $" + balance);
    }
}

class Bank {
    private String bankName;
    private List<Cust> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(String name, String customerId, double initialDeposit) {
        Cust customer = new Cust(name, customerId, initialDeposit);
        customers.add(customer);
        System.out.println("Account opened for " + name + " at " + bankName);
    }

    public void showAllCustomers() {
        System.out.println("\n--- Customers of " + bankName + " ---");
        for (Cust c : customers) {
            c.viewBalance();
        }
    }

    public Cust getCustomer(int index) {
        if (index >= 0 && index < customers.size()) {
            return customers.get(index);
        } else {
            return null;
        }
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI Bank");
        sbi.openAccount("Alice", "C001", 1000);
        sbi.openAccount("Bob", "C002", 2000);
        sbi.showAllCustomers();

        Cust alice = sbi.getCustomer(0);
        if (alice != null) {
            alice.deposit(500);
            alice.withdraw(200);
            alice.viewBalance();
        }
    }
}
