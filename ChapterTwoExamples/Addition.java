package ChapterTwoExamples;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;

       // System.out.println("The sum is: " + sum);

        System.out.printf("The Sum is %d", sum);

//        System.out.printf("The sum is %d%n", (firstNumber + secondNumber));
    }
}
