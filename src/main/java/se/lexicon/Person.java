package se.lexicon;

public class Person {
    // Fields
    String firstName;
    String lastName;
    int age;
    String hobby;
    // add more fields... :)

    // Constructors

    // Methods
    public String getInformation() {
        String personData = "First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age + ", Hobby: " + hobby;
        return personData;
    }
}
