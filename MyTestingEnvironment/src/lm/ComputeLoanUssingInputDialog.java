package lm;

import javax.swing.JOptionPane;

public class ComputeLoanUssingInputDialog {
    public static void main(String[] args) {
        //Enter yearly interest rate
        String annualInterestRateString = JOptionPane.showInputDialog("Enter yearly interest rate");

        //Convert string to double
        double annualInterestRate = Double.parseDouble(annualInterestRateString);

        //obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        //Enter number of years
        String numberOfYearsString = JOptionPane.showInputDialog("Enter number of years :");

        //Convert string to int
        int numberOfYears = Integer.parseInt(numberOfYearsString);

        //Enter loan amount
        String loanString = JOptionPane.showInputDialog("Enter loan amount:");

        //Convert string to double
        double loanAmount = Double.parseDouble(loanString);

        //Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        //Format to keep two digits after the decimal point
        monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
        totalPayment = (int)(totalPayment * 100) / 100.0;

        //Display results
        String output = "The monthly payment is $" + monthlyPayment + "\nThe total payment is $" + totalPayment;
        JOptionPane.showMessageDialog(null, output);
    }
    
}