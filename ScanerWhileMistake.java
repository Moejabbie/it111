import java.util.Scanner;

public class ScanerWhileMistake {

    public static void main(String[] args) {


        int counter = 1;
        int grade;
        double total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        while (counter <= 5) {
            System.out.println("please enter your" + counter + " numerical grade");
            grade = input.nextInt();
            total += grade;
            counter += 1;

        }

        String message;
        char lettergrade;

        counter -= 1;

        average = total / counter;

        System.out.println("you have earned at average grade of" + average+ " after providing us with " +counter+ " grades");

        if (average >= 90 && average <= 100) {
            lettergrade = 'A';
            message = "exellent work!";
        } else if (average >= 80 && average <= 90) {
            lettergrade = 'b';
            message = "solid work";

        } else if (average >= 70 && average <= 80) {
            lettergrade = 'c';
            message = "more studying necessary";

        } else if (average >= 65 && average <= 70) {
            lettergrade = 'd';
            message = "squeaking by";
        } else {
            lettergrade = 'f';
            message = "not a passing grade";
        }

        System.out.println("you have earned the following letter grade " + lettergrade + ", and here is the message: Exellent work!");
    }


    }

