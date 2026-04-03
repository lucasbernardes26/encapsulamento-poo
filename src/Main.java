import entities.BankAccount;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int opc;

        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount;
        int numberAccount;
        String holder;
        double balance;

        System.out.println("Enter your number Account: ");
        numberAccount = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter with the holder: ");
        holder = sc.nextLine();

        System.out.println("Do you want to create an account with an initial deposit?");
        System.out.println("(1) - Yes");
        System.out.println("(2) - No");
        opc = sc.nextInt();

        if (opc == 1) {
            System.out.println("Enter your initial deposit: ");
            balance = sc.nextDouble();

            bankAccount = new BankAccount(numberAccount, holder, balance);
            System.out.println("Account created!");
        } else {
            bankAccount = new BankAccount(numberAccount, holder);
            System.out.println("Account created!");
        }
        //Depósito
        System.out.print("Enter the value of deposit: ");
        double deposit = sc.nextDouble();
        bankAccount.deposit(deposit);
        System.out.println("Updated data: " + bankAccount);

        //Saque
        System.out.print("Enter the value of withdraw: ");
        double withdraw = sc.nextDouble();
        bankAccount.withdrawValue(withdraw);
        System.out.println("Updated data: " + bankAccount);

        sc.close();
    }
}