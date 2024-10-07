package se.lexicon;

public class SelectionsDemo {

    public static void main(String[] args) {
        int number = 6; // odd or even ?
        if (number % 2 != 0) {
            System.out.println("Odd number.");
        } else {
            System.out.println("Even number.");
        }


        int studentScore = 50;
        if (studentScore >= 90) {
            System.out.println("Grade A");
        } else if (studentScore >= 80) {
            System.out.println("Grade B");
        } else if (studentScore >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Monday!");
                break;
            case 2:
                System.out.println("It's Tuesday!");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            case 4:
                System.out.println("It's Thursday!");
                break;
            case 5:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("It's the weekend! :)");
        }

    }

}
