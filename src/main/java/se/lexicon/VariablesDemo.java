package se.lexicon;

public class VariablesDemo {

    public static void main(String[] args) {
        long balance = 500000;
        balance = 600000;
        double area = 25.22;
        float radius = 5.5f;
        char grade = 'A';
        char gradeUn = '\u0041';
        int accountNumber = 123456;

        boolean isLoggedIn; // default value for boolean is false

        // sout + tab
        System.out.println("Balance: " + balance); // 600000

        double decimal;
        int num1 = 10,num2,num3;


        String firstName = "Mehrdad";
        String lastName = "Javan";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.toLowerCase());


    }

}
