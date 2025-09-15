package BankManagement;
import java.util.Scanner;

class BankAccount {
    private String username;
    private String password;
    private double balance;
    private boolean loggedIn;
    public BankAccount(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.loggedIn = false;
    }
    public boolean login(String user, String pass) {
        if (user.equals(username) && pass.equals(password)) {
            loggedIn = true;
            System.out.println(" Login successful. Welcome, " + username + "!");
            return true;
        } else {
            System.out.println(" Invalid username or password.");
            return false;
        }
    }
    public void logout() {
        if (loggedIn) {
            loggedIn = false;
            System.out.println(" Logged out successfully.");
        } else {
            System.out.println(" You are not logged in.");
        }
    }
    public void deposit(double amount) {
        if (!loggedIn) {
            System.out.println(" Please login first.");
            return;
        }
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println(" Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (!loggedIn) {
            System.out.println(" Please login first.");
            return;
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println(" Invalid or insufficient funds.");
        }
    }
    public void checkBalance() {
        if (!loggedIn) {
            System.out.println(" Please login first.");
            return;
        }
        System.out.println(" Current Balance: " + balance);
    }
}
public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("user", "pass", 1000);

        while (true) {
            System.out.println("\n===== Welcome to Bank of Baroda =====");
            System.out.println("1. Login");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Logout");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String user = sc.next();
                    System.out.print("Enter password: ");
                    String pass = sc.next();
                    account.login(user, pass);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double with = sc.nextDouble();
                    account.withdraw(with);
                    break;
                case 4:
                    account.checkBalance();
                    break;
                case 5:
                    account.logout();
                    break;
                case 6:
                    System.out.println(" Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println(" Invalid option, try again.");
            }
        }
    }
}

