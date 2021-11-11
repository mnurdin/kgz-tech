import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {
//  printGreatest();

        int value = 10;
        int val = 3;

        System.out.println(value % val);

//        System.out.println(value);

//        System.out.println(value);
    }


    public static void printGreatest() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + ",\n\nEnter first value: ");
        int first = scanner.nextInt();

        System.out.println("Enter second value: ");
        int second = scanner.nextInt();

        System.out.println("Now I will print the greatest of these two!");

        if (first > second) {
            System.out.println("Greatest of two: " + first);
        } else if (second > first) {
            System.out.println("Greatest of two: " + second);
        } else if (first == second) {
            System.out.println("Values are EQUAL!!!");
        }
    }
}
