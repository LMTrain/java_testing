package lm;
import javax.swing.JOptionPane;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        //Enter Day of the Week in Numbers
        String dayString = JOptionPane.showInputDialog("Enter day of the week in number");

        //Convert string to int
        int day = Integer.parseInt(dayString);
        printDayOfTheWeek(day);
    }
    private static void printDayOfTheWeek(int day) {
        switch(day) {
            case 1:
                String monday = "The day of the week is Monday";
                JOptionPane.showMessageDialog(null, monday);
                break;
            case 2:
                String tuesday = "The day of the week is Tuesday";
                JOptionPane.showMessageDialog(null, tuesday);
                break;
            case 3:
                String wednesday = "The day of the week is Wednesday";
                JOptionPane.showMessageDialog(null, wednesday);
                break;
            case 4:
                String thursday = "The day of the week is Thursday";
                JOptionPane.showMessageDialog(null, thursday);
                break;
            case 5:
                String friday = "The day of the week is Friday";
                JOptionPane.showMessageDialog(null, friday);
                break;
            case 6:
                String saturday = "The day of the week is Saturday";
                JOptionPane.showMessageDialog(null, saturday);
                break;
            case 7:
                String sunday = "The day of the week is Sunday";
                JOptionPane.showMessageDialog(null, sunday);
                break;
            default:
                String wrongDay = day + " is not a day of the week";
                JOptionPane.showMessageDialog(null, wrongDay);
                break;
        }

    }
}