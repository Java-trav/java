// this code uses the main method
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        // goal use System.out.format to print out The value of pi is approximately 3.14.
        double pi = 3.14159;
        // used string variable with the name word with a string
        String word = "The value of pi is approximately";
        // used System.out.format and added pi and word to print out The value of pi is approximately 3.14.

        System.out.format(word + " " + pi + " ");
        // they're multiple ways to get this done below are a few others

        double pie = 3.14159;
        System.out.printf("The value of pi is approximately. %s%n", pie);

        Scanner scanner = new Scanner(System.in);

        // ask user to enter number using System.out.print
        System.out.print("Enter an integer: ");

        // stores the number in the intputNum variable after it is read
        int inputNum = scanner.nextInt();
        // Closes the scanner


        // print out a string plus the number stored from the inputNum variable
        System.out.println("You entered: " + inputNum);

        //        String one = "Enter a number: ";
//        int numInput = scanner.nextInt();
//        scanner.close();
//        String two = "You entered: ";
//        System.out.print(one);
//        System.out.print(numInput);
//        System.out.print(two);


        //////
        // user is asked to enter 3 words that are stored in 3 seperate veriables
        System.out.print("Enter 3 words: ");
        String inputWordOne = scanner.next();
        String inputWordTwo = scanner.next();
        String inputWordThree = scanner.next();

        // Closes the scanner


        // Display the entered words on separate lines
        System.out.println("Your words:");
        System.out.println(inputWordOne);
        System.out.println(inputWordTwo);
        System.out.println(inputWordThree);

        //////
        // this will ask a user to enter a sentence
        System.out.print("please enter a sentence: ");
        // the new line for characters left in buffer
        scanner.nextLine();
        // reads the input from the user
        String sentInput = scanner.nextLine();
        // prints out the users input using the variable sentInput
        System.out.println("your input: " + sentInput);
    }
}
