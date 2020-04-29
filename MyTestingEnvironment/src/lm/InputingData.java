package lm;

import java.util.Scanner;

public class InputingData {

    public static void main(String args[]) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //prompts the user to enter an integer
        System.out.println("******************************");
        System.out.println("Enter an Integer: ");
        int intValue = input.nextInt();
        System.out.println("You entered the integer " + intValue);

        //prompt user to enter a double value
        System.out.println("Enter a double value: ");
        double doubleValue = input.nextDouble();
        System.out.println("You entered the double value " + doubleValue);

        //prompt the user to enter a string
        System.out.println("Enter a string without space: ");
        String string = input.next();
        System.out.println("You entered the string " + string);
        System.out.println("******************************");

        System.out.println();
        System.out.println("******************************");
        System.out.println("* COMPUTING LOAN CALCULATION *");
        System.out.println("******************************");
        System.out.println();

        //Enter yearly interest rate
        System.out.print("Enter yearly interest rate: ");
        double annualInterestRate = input.nextDouble();

        //obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        //Enter number of years
        System.out.print("Enter Loan Years : ");
        int numberOfYears = input.nextInt();

        //Enter Loan Amount
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        //Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        //Format to keep two digits after the decimal point
        monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
        totalPayment =  (int)(totalPayment * 100) / 100.0;

        //Display results
        System.out.println("The monthly payment is $" + monthlyPayment);
        System.out.print("The total payment is $" + totalPayment);

        System.out.println();
        System.out.println("**************************");
        System.out.println("* COMPUTING MONEY CHANGE *");
        System.out.println("**************************");
        System.out.println("\n");

        //Receive the amount
        System.out.println("Enter an amount : ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);

        //Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        //Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        //Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        //Find the number in pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        //Display results
        String output = "Your amount " + "$" + amount + " consists of \n" +
                "\t" + numberOfOneDollars + " dollars\n" +
                "\t" + numberOfQuarters + " quarters\n" +
                "\t" + numberOfDimes + " dimes\n" +
                "\t" + numberOfNickels + " nickels\n" +
                "\t" + numberOfPennies + " pennies";
        System.out.println(output);
    }

}