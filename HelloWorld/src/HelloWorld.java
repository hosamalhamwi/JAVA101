import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String name , surname , age ;
        int intAge , totalAge;
        final int currentYear = 2021;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name :");
        name = scan.nextLine();

        System.out.println("Please enter your surname :");
        surname = scan.nextLine();

        System.out.println("Please enter your age : ");
        age = scan.nextLine();

        intAge = Integer.parseInt(age);
        totalAge = currentYear - intAge ;

        System.out.println("Hello " + name + " " + surname + " Welcome to JAVA" + " " + totalAge);

    }
}
