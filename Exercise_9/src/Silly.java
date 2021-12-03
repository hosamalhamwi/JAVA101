import java.util.Scanner;

public class Silly {
    public static void main(String[] args) {

        String surname , name;
        Scanner sc = new Scanner(System.in);
        Reverse rv = new Reverse("Muhammad" , "Qazi");

        System.out.println("Please enter your name : ");
        name = sc.nextLine();

        System.out.println("Please enter your Surname : ");
        surname = sc.nextLine();

        rv.setName(name);
        rv.setSurname(surname);

        System.out.println(rv.getSurname() + " " + rv.getName());
        System.out.println(rv.getName().charAt(0));

    }
}
