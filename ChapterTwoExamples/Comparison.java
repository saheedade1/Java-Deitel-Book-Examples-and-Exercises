package ChapterTwoExamples;

import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber == secondNumber) {
            System.out.printf("%d == %d%n", firstNumber, secondNumber);
        }
        if (firstNumber != secondNumber) {
            System.out.printf("%d != %d%n", firstNumber, secondNumber);
        }
        if (firstNumber < secondNumber) {
            System.out.printf("%d < %d%n", firstNumber, secondNumber);
        }
        if (firstNumber > secondNumber) {
            System.out.printf("%d > %d%n", firstNumber, secondNumber);
        }
        if (firstNumber <= secondNumber) {
            System.out.printf("%d <= %d%n", firstNumber, secondNumber);
        }
        if (firstNumber >= secondNumber) {
            System.out.printf("%d >= %d%n", firstNumber, secondNumber);
        }
    }
}