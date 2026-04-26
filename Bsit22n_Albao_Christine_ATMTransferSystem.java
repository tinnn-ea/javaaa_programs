package bsit_22n;

import java.util.Scanner;

public class Bsit22n_Albao_Christine_ATMTransferSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bal = 7000;
        int choice = 0;

        do {
            System.out.println("\n============ATM MENU=========");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Transfer");
            System.out.println("5 - Exit");

            System.out.println("Enter a number: ");
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Your current balance is: " + bal);
                    break;

                case 2:
                    System.out.println("Input amount to deposit: ");
                    int d_am = input.nextInt();
                    if (d_am > 0) {
                        bal = (bal + d_am);
                        System.out.println("Deposit Successful! Your new balance is: " + bal);
                    } else {
                        System.out.println("INVALID AMOUNT!");
                    }
                    break;

                case 3:
                    System.out.println("Input amount to withdraw: ");
                    int w_am = input.nextInt();
	                    if (w_am <= 0 || w_am > 2000) {
	                        	System.out.println("INVALID AMOUNT!");
	                    }else if (w_am > bal) {
	                        	System.out.println("INSUFFICIENT BALANCE!");
	                    } else {
	                        bal = (bal - w_am);
	                        System.out.println("Withdraw Successful ! Your new balance is: " + bal);
	                    }
                    break;

                case 4:
                    System.out.println("Enter Receiver Account Number: ");
                    int r_am = input.nextInt();
                    System.out.println("Enter Amount to be Transferred: ");
                    int t_am = input.nextInt();
                    if (t_am <= 0) {
                        System.out.println("INVALID AMOUNT!");
                    } else if (t_am > bal) {
                        System.out.println("INSUFFICIENT BALANCE!");
                    } else {
                        bal = (bal - t_am);
                        System.out.println("TRANSFER SUCCESSFUL!");
                        System.out.println("Your new balance is: " + bal);
                    }
                    break;

                case 5:
                    System.out.print("program terminated.");
                    break;

                default:
                    System.out.print("INVALID CHOICE!");
            }

        } while (choice != 5);

        input.close();
    }
}