package se.lexicon;

public class StringDemo {

    public static void main(String[] args) {
        ex1();
    }

    // Creating Strings & String concatenation
    public static void ex1() {
        String str1 = "    Hello, World!   ";
        System.out.println(str1.trim());
        /*
        String str2 = new String("Hello, World!");

        String original = "Hello"; // Hello
        //original = original.concat(", ").concat("World!"); // Hello, World!
        original = original + ", " + "World!"; // Hello, World!
        System.out.println(original); // Output: Hello, World!
         */
    }


    // length() & charAt()
    public static void ex2() {
        String name = "Erik Svensson"; //
        System.out.println(name.length());
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    public static void ex3() {
        String string = "Hello Strings";
        int index1 = string.indexOf("llo"); // index1 = 2
        // soutv + tab
        System.out.println("index1 = " + index1);
        int index2 = string.indexOf('H'); // index2 = 0
        System.out.println("index2 = " + index2);
        int index3 = string.indexOf('l', 3); // index3 = 2
        System.out.println("index3 = " + index3);
    }

    public static void ex4() {
        String name = "Erik Svensson";
        System.out.println(name.startsWith("Erik")); // true
        System.out.println(name.endsWith("sson")); // true
        System.out.println(name.toLowerCase().startsWith("erik")); // true
        System.out.println(name.contains("ve")); // true
    }

    public static void ex5() {
        String name = "Erik Svensson";

        // how to count how many (s or S) chars exist in the name
        // step1: access the length of the name
        // step2: declare loop
        // step3: declare a counter variable then if we found the s char (counter++)
        // step4: print the result
        int length = name.length();
        int counter = 0;

        for (int i = 0; i < length; i++) {
           char currentChar = name.charAt(i);
           if (currentChar == 's' || currentChar == 'S'){
               counter++;
           }
        }

        System.out.println("Number of 's || S' is: " + counter); // 3


        int lengthWithS = name.length(); // Erik Svensson = 13
        int lengthWithoutS = name.replaceAll("[sS]", "").length(); // Erik venon = 10
        int count = lengthWithS - lengthWithoutS; // 3
        System.out.println("Number of 's || S' is: " + count); // 3



    }


}
