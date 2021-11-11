import java.util.Scanner;

public class StringManipulation {

    static byte number;
    static int age;
    static float id;
    static long bigNumber;
    double price = 9.99;
    static boolean isEqual;
    static String name;


    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2021;

        /*Implement your logic here:*/
        int age = currentYear - birthYear;
        getAge();

        isEqual = currentYear > birthYear;

        if (age >= 21) {
            System.out.println("I am allowed to drive!");
        } else {
            System.out.println("I have to wait till I turn 21");
        }

        //Result -> Age: 21
    }

    public static void getAge() {
        System.out.println("Age: " + age);
    }
    //Take two int values from user and print greatest among them.


}
