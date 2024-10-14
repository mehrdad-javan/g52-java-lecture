package se.lexicon;

public class MethodOverLoadingDemo {
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }


    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double multiply(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    public static void processPayment(String cardNumber, String cvv, double amount) {
        // Code to process credit card payment
    }

    public static void processPayment(String bankAccount, String swiftCode, double amount, String currency) {
        // Code to process the bank transfer
    }


    public static void calculateDiscount(int loyaltyPoints, double price, String company) {

    }

    public static void calculateDiscount(String couponCode, double price) {

    }


    public static double calculateArea(double side) {
        return side * side;
    }

    public static double calculateArea(double length, double width) {
        return length * width;

    }



}
