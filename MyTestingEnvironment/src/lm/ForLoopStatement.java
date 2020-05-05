package lm;

public class ForLoopStatement {
    public static void main(String[] args) {
        System.out.println("*****************************************************");
        int countN = 0;
        int sum = 0;

        for(int i=1; i<=1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                countN++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if(countN == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");

        System.out.println("10,000 at 2% = " + calculateInterest(10000.0, 2.0));
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");

        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        int count = 0;
        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number" + "  This is isPrime = " + isPrime(i));
                System.out.println("Count is " + count);
                if(count == 3) {
                    System.out.println("Existing for loop");
                    break;
                }
            } else {
                System.out.println("This is isPrime = " + isPrime(i));
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }
}