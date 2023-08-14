import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
        //while loop that is less than or equal to 15
        while (i <= 15) {
            // this is the current output or i
            System.out.print(i + " ");
            // this is the incrememnt of i
            i++;
        }

        int num = 0;
        // do while loop
        do {
            // prints out an integer
            System.out.println(num);
            // increment by 2 but stops at 100
            num += 2;
        } while (num <= 100);

        int newNum = 100;
        // do while loop
        do {
            // prints out an integer
            System.out.println(newNum);
            // decrement by 5 but stops at -10
            newNum -= 5;
        } while (newNum >= -10);

        int numTwo = 2;
        do {
            System.out.println(numTwo);
            numTwo *= 2;
        } while (numTwo <= 1000000);


        for (int y = 1; y <= 100; y++) {
            if (y % 3 == 0 && y % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (y % 3 == 0) {
                System.out.println("Fizz");
            } else if (y % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(y);
            }
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("What number would you like to go up to? ");
            int n = scanner.nextInt();
            displayPowersTable(n);

            System.out.print("Do you want to continue? (yes/no): ");
            String continueChoice = scanner.next().toLowerCase();
            if (!continueChoice.equals("yes")) {
                break;
            }
        }


    }

    public static void displayPowersTable(int n) {
        System.out.println("Here is your table!\n");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int i = 1; i <= n; i++) {
            int squared = i * i;
            int cubed = i * i * i;
            System.out.printf("%-6d | %-7d | %-5d%n", i, squared, cubed);
        }
        System.out.println();
// below code for new question grades
        Scanner scanner = new Scanner(System.in);
        String answer;
        // do while loop with conditionals inside that prints different grade options
//        do{
//            System.out.println("Please enter a numerical grade: ");
//            int grade = scanner.nextInt();
//            if(grade >= 88 && grade <=100){
//                System.out.println("your grade is an A!");
//            }else if(grade >=80 && grade <= 87){
//                System.out.println("your grade is a B.");
//            }else if(grade >=67 && grade <= 79){
//                System.out.println("your grade is a C... could B better...");
//            }else if(grade >=60 && grade <= 66){
//                System.out.println("your grade is a D... did you study?");
//            }else{
//                System.out.println("your grade is a F... FATALITY!");
//            }
//            System.out.print("Do you want to continue? (yes or no): ");
//            answer = scanner.next();
//        }while(answer.equalsIgnoreCase("yes"));

        do{
            System.out.println("Please enter a numerical number: ");
            int grade = scanner.nextInt();
            if(grade >= 97 && grade <= 100){
                System.out.println("Congrats A+!");
            }else if(grade >= 93 && grade <= 96){
                System.out.println("Congrats on getting an A!");
            }else if(grade >= 90 && grade <= 92){
                System.out.println("Not bad but not the best A-");
            }else if(grade >= 87 && grade <= 89){
                System.out.println("Almost an A but it's a B+!");
            }else if(grade >= 83 && grade <= 86){
                System.out.println("It's just a B");
            }else if(grade >= 80 && grade <= 82){
                System.out.println("Not good B-");
            }else if(grade >= 77 && grade<= 79){
                System.out.println("Did you study mr C+");
            }else if(grade >= 73 && grade <= 76){
                System.out.println("just a C");
            }else if(grade >= 70 && grade <= 72){
                System.out.println("you should study more C-");
            }else if(grade >=67 && grade <= 69){
                System.out.println("D+");
            }else if(grade >= 65 && grade <= 66){
                System.out.println("D");
            }else if(grade >= 64){
                System.out.println("Seriously study D-");
            }else{
                System.out.println("your grade is a F... FATALITY!");
            }

            System.out.print("Do you want to continue? (yes or no): ");
            answer = scanner.next();
        }while(answer.equalsIgnoreCase("yes"));
    }
}
