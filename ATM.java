
/**
 * Write a description of class CliATM here.
 * Simple functional cli ATM application
 * @author (Isabella Allen)
 * @version (version 1 - 2501/2023)
 */

import java.util.Scanner;
public class ATM
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
    int choice;
    int balance = 100;
    int withdraw;
    int deposit;
    
    do{
        System.out.println("Bank Online");
        System.out.println();
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        System.out.println();
        
            if(choice ==1)
            {
                System.out.print("How much would you want to withdraw: ");
                withdraw = sc.nextInt();
                balance = balance - withdraw;
                System.out.println();
                System.out.println("Your new balance is: "+ balance);
                System.out.println();
            }
            else if (choice == 2)
            {
                System.out.print("How much do you want to deposit: ");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println();
                System.out.println("Your new balance is: "+ balance);
                System.out.println();
            }
            else if (choice == 3)
            {
                System.out.println("Your account balance is: "+ balance);
            }
            else
            {
                System.out.println("Thank you and goodbye!");
            }
    }while(choice != 4);
    }
}
