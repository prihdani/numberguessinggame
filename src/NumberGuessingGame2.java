import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame2 {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int findThisNumber = randomNumber.nextInt(100);
        System.out.println(findThisNumber);

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do{
            System.out.print("Guess a number between 0 and 100: ");
            number = scanner.nextInt();

            if(number > findThisNumber) System.out.println("The number you guessed is higher than the actual number! \n");

            if(number < findThisNumber) System.out.println("The number you guessed is lower than the actual number! \n");

        }while(number != findThisNumber);

        System.out.println("Good job, you guessed right!");

    }
}
