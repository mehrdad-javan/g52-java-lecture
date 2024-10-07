package se.lexicon;

public class MethodsDemo {

    public static void main(String[] args) {
        printMenu();


        System.out.println(addition(10, 5));
        System.out.println(addition(2, 2));


    }

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
