import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args){

        int i = 5;
        //while loop that is less than or equal to 15
        while(i <= 15){
            // this is the current output or i
            System.out.print(i + " ");
            // this is the incrememnt of i
            i++;
        }

        int num =0;
        // do while loop
        do{
            // prints out an integer
            System.out.println(num);
            // increment by 2 but stops at 100
            num +=2;
        }while(num <= 100);

        int newNum= 100;
        // do while loop
        do{
            // prints out an integer
            System.out.println(newNum);
            // decrement by 5 but stops at -10
            newNum -=5;
        }while(newNum >= -10);
    }
}
