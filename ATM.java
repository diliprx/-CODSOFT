import java.util.*;
class Bank{
    double bal;
    public Bank(double bal) {
        this.bal = bal;
    }
    public void deposit(double amt) {
            bal += amt;
            System.out.println("Deposit successful current balance is : " + bal);
    }
    public void withdraw(double x) {
        if (x <= bal) {
            bal -= x;
            System.out.println("Withdrawal successful Current balance is : " + bal);
        } else{
            System.out.println("Insufficient for withdrawal");
        } 
    }
    public void check() {
        System.out.println("Current balance is : " + bal);
    }
    public double getbal() {
        return bal;
    }
}
class ATM {
    private Bank acc;
    public ATM(Bank acc) {
        this.acc = acc;
    }
    public void show() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the ATM!");
        do {
            System.out.println("choose option");
            System.out.println("1.check balance");
            System.out.println("2.deposit");
            System.out.println("3.withdraw");
            System.out.println("4.exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    acc.check();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = scanner.nextDouble();
                    acc.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double with = scanner.nextDouble();
                    acc.withdraw(with);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

    }
}
public class Main {
    public static void main(String[] args) {
        Bank acc = new Bank(5000.00);
        ATM atm = new ATM(acc);
        atm.show();
    }
}
