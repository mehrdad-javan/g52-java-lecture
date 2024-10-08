package se.lexicon;

public class LoopsDemo {

    public static void main(String[] args) {

        System.out.println("Example 1 : While Loop");
        int count = 1; // 3
        while (count <= 5) {
            System.out.println(count); // 1 2 3
            count++; // count = count + 1;
        }

        System.out.println("-----------------");

        System.out.println("Example 2 : Do-While Loop");
        int num = 1;
        do {
            System.out.println("Iteration : " + num);
            num++;
        } while (num <= 5);

        System.out.println("-----------------");

        System.out.println("Example 3 : For Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration : " + i);
        }

        System.out.println("-----------------");
        System.out.println("Example 4 : For Loop");
        for (int i = 1; i <= 10; i++) {
            boolean isEvenNumber = i % 2 == 0;
            if (isEvenNumber) {
                System.out.println("Iteration : " + i);
            }
        }

        System.out.println("-----------------");
        System.out.println("Example 5 : For Loop");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
