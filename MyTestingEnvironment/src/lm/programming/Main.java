package lm.programming;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome To My Java Testing Environment", "Autor: Laycon Muriziq", (JOptionPane.INFORMATION_MESSAGE));
        
        //Expression - A mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50; // An expression without the int
        if (highScore == 50) {
            //Control statement
            System.out.println("This is an expression");
        }

        // In the following code below, write down what parts of the code are expressiona.
        int score = 100;
        if (score > 90) {
            System.out.println("You got the highest score");
            score = 0;
        }
        
        //Statements
        int myVariable = 50;
        myVariable++;
        myVariable--;
            System.out.println("This a Test");

            //WhiteSpace - THIS SILLY
        int         myWhiteSpace        =      50;


        boolean gameOver = true;
	    int scoreEx = 5000;
	    int levelCompleted = 5;
	    int bonus = 100;

	    if (scoreEx < 5000 && scoreEx > 1000) {
            System.out.println("your score was less than 5000");
        } else if (scoreEx < 1000) {
            System.out.println("your score is less than 1000");
        } else {
            System.out.println("Got here");
        }
	    
	    if (gameOver == true) {
	        int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
