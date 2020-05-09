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
        
        String weekStatus = " ";

        if (day <= 3) {
            weekStatus = ", and I am fasting today";
        } else {
            weekStatus =  ", and I am not fasting today";
        }
        switch(day) {
            case 1:
                String monday = "The day of the week is Monday" + weekStatus;
                JOptionPane.showMessageDialog(null, monday);
                break;
            case 2:
                String tuesday = "The day of the week is Tuesday" + weekStatus;
                JOptionPane.showMessageDialog(null, tuesday);
                break;
            case 3:
                String wednesday = "The day of the week is Wednesday" + weekStatus;
                JOptionPane.showMessageDialog(null, wednesday);
                break;
            case 4:
                String thursday = "The day of the week is Thursday" + weekStatus;
                JOptionPane.showMessageDialog(null, thursday);
                break;
            case 5:
                String friday = "The day of the week is Friday" + weekStatus;
                JOptionPane.showMessageDialog(null, friday);
                break;
            case 6:
                String saturday = "The day of the week is Saturday" + weekStatus;
                JOptionPane.showMessageDialog(null, saturday);
                break;
            case 7:
                String sunday = "The day of the week is Sunday" + weekStatus;
                JOptionPane.showMessageDialog(null, sunday);
                break;
            default:
                String wrongDay = day + " is not a day of the week";
                JOptionPane.showMessageDialog(null, wrongDay);
                break;
        }

    }
}