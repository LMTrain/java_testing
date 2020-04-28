package lm.programming;
import javax.swing.JOptionPane;

import lm.SpeedConverter;

//Method
public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Laycon", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);

       double miles = SpeedConverter.toMilesPerHour(10.5);
       System.out.println("Miles = " + miles);

       SpeedConverter.prinConversion(10.5);

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

        boolean gameOverG = true;
        int scoreG = 800;
        int levelCompletedG = 5;
        int bonusG = 100;

        int highScoreG = calculateScore(gameOverG, scoreG, levelCompletedG, bonusG);
        System.out.println("Your final score was " + highScoreG);

        scoreG = 10000;
        levelCompletedG = 8;
        bonusG = 200;
        highScoreG = calculateScore(gameOverG, scoreG, levelCompletedG, bonusG);
        System.out.println("Your final score was " + highScoreG);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
        

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        // if(playerScore >= 1000) {
        //     return 1;
        // }else if(playerScore >= 500 && playerScore < 1000) {
        //     return 2;
        // }else if(playerScore >= 100 && playerScore < 500) {
        //     return 3;
        // }else {
        //     return 4;
        // }
        int position = 4; // assuming position 4 will be returned

        if(playerScore >= 1000); {
            position = 1;
        } if(playerScore >= 500) {
            position = 2;
        }else if(playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    //Method
    public static int calculateScore(boolean gameOverG, int scoreG, int levelCompletedG, int bonusG) {

        if (gameOverG) {
            int finalScoreG = scoreG + (levelCompletedG * bonusG);
            finalScoreG += 2000;
            return finalScoreG;
        } else {
            return -1; //In JAVA -1 means return an error, Invalid value or value not found
        }

    } 

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet <0) || ((inches <0) && (inches >12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    
}
