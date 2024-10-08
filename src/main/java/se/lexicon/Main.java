package se.lexicon;

public class Main {

    // single line comment
    /*
        multi-line comment
     */

    // psvm + tab
    public static void main(String[] args) {


        MethodsDemo.printMenu();
        System.out.println(MethodsDemo.addition(10, 5));
        System.out.println(MethodsDemo.addition(1, 1));

        /*Person erik = new Person();
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.age = 42;
        erik.hobby = "programming";

        System.out.println(erik.getInformation()); //

        Person simon = new Person();
        simon.firstName = "Simon";
        simon.lastName=  "Elbrink";

        System.out.println(simon.getInformation()); // ?

        int num1 = 10;
        int num2 = 5;
        int additionResult = num1 + num2;

        int additionResult2 = num1 + 50;*/


        Car volvo = new Car();
        volvo.regId = "abc1111";
        volvo.brand= "VOLVO";
        volvo.model = "V60";
        volvo.year = 2024;

        Car bmw = new Car();
        // regId = null
        // brand = null
        // model = null
        // year = 0
        bmw.regId = "abc1111";
        bmw.brand= "BMW";
        bmw.model = "X6";
        bmw.year = 2024;

    }

}