package se.lexicon;

import java.util.Scanner;

public class MethodsDemo {

    public static void main(String[] args) {
        boolean isActive = true;

        while(isActive){
            printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choice:");
            int operationNumber = scanner.nextInt();
            switch (operationNumber){
                case 1:
                    // perform addition operation
                    System.out.println("addition operation");
                    break;
                case 2:
                    // perform subtraction operation
                    System.out.println("subtraction operation");
                    break;
                case 0:
                    isActive = false;
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid choice. please enter a number between 0 - 2");
            }
        }


    } // end of the main method


    // declare a method that takes nothing and prints menu
    public static void printMenu() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("0. Exit");
    }

    // declare a method that takes 2 numbers and return the addition result
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

}
