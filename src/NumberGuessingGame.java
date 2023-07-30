import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int findThisNumber = randomNumber.nextInt(100);
        System.out.println(findThisNumber);


        System.out.println("Guess a number between 0 and 100: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();




        while(number < 0 || number > 100){
            System.out.println("The number must be between 0 and 100!");
            number = scanner.nextInt();
        }

        while (number < findThisNumber) {
            System.out.println("The number is higher than your guess!");
            number = scanner.nextInt();
        }

        while(number > findThisNumber){
            System.out.println("The number is lower than your guess!");
            number = scanner.nextInt();
        }

        if (number == findThisNumber) {
            System.out.println("You guessed it!");
        }

    }
}