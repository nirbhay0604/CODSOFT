import java.util.*;
public class Task3 {
    static Scanner inputScanner = new Scanner(System.in);
    int balance;
    static String user = "admin";
    static int userPin = 2210;

    public void deposit(int depositAmount){
        balance += depositAmount;
        System.out.println("Transaction Complete");
    }

    public void showBalance(){
        System.out.println(balance);
        System.out.println("Transaction Complete");
    }

    public void withdraw(int withdrawalAmount){
        if(withdrawalAmount > 0 && withdrawalAmount <= balance){
            balance -= withdrawalAmount;
            System.out.println("Transaction Complete");
        } else {
            System.out.println("Withdrawal amount is either zero or greater than bank balance");
        }
    }

    public void displayMenu() {
        System.out.println("\n===== ATM Menu =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = inputScanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance();
                    break;
                case 2:
                    System.out.println("Enter amount for depositing");
                    int depositAmount = inputScanner.nextInt();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter amount for withdrawal");
                    int withdrawalAmount = inputScanner.nextInt();
                    withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    public static void main(String[] args) {
        Task3 atm = new Task3();
        System.out.println("Enter user name");
        String enteredUsername = inputScanner.nextLine();
        System.out.println("Enter Your Pin");
        int enteredPin = inputScanner.nextInt();
        if(enteredUsername.equals(user) && userPin == enteredPin){
            atm.run();
        } else {
            System.out.println("Username or password is wrong");
        }
    }
}
