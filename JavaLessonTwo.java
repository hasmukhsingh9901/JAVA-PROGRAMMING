import java.util.Scanner;

public class JavaLessonTwo {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Your favorite number: ");
        if (userInput.hasNextInt()) {
            int numberEntered = userInput.nextInt();
            System.out.println("You entered " + numberEntered);
            int numberEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numberEntered + " + " + numberEntered + " = " + numberEnteredTimes2);

            int numberEnteredMinus2 = numberEntered - 2;
            System.out.println(numberEntered + " - 2 = " + numberEnteredMinus2);

            int numberEnteredTimesSelf = numberEntered * numberEntered;
            System.out.println(numberEntered + " * " + numberEntered + " = " + numberEnteredTimesSelf);

            int numberEnteredDividedBy2 = numberEntered / 2;

            System.out.println(numberEntered + " / 2 = " + numberEnteredDividedBy2);

            int numEnteredRemainder = numberEntered % 2;

            System.out.println(numberEntered + " % 2 = " + numEnteredRemainder);

            numberEntered += 2;
            numberEntered -= 2;

            int numberABS = Math.abs(numberEntered);

            System.out.println("Number abs = " + numberABS);

            double numSqrt = Math.sqrt(5.23);

            int numCeiling = (int) Math.ceil(5.23);
            System.out.println("Ceiling: " + numCeiling);

            int roundNum = (int) Math.round(5.23);
            System.out.println("Round: " + roundNum);
            int numFloor = (int) Math.floor(5.23);
            System.out.println("Floor: " + numFloor);


            int randomNumber = (int) (Math.random() * 11);

            System.out.println("Random number: " + randomNumber);

        } else {
            System.out.println("Enter an integer next time");
        }
    }
}
