


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
    }
}
