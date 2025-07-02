import java.util.Scanner;

public class SimpleATM {

    // Initial balance
    static double balance = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to Simple ATM!");

        do {
            System.out.println("\n ----CHOOSE OPTION----  " );
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(sc);
                    break;
                case 3:
                    withdraw(sc);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }

    // Check balance
    public static void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    // Deposit money
    public static void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money
    public static void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}