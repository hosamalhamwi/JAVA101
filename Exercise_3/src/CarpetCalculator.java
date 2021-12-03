import java.util.Scanner;

public class CarpetCalculator {
    public static void main(String[] args) {

        String length , width , choice;
        final int int_Length , int_Width ;
        final double total;
        int int_Choice;
        boolean validator , choice_valid = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("********* CARPET CALCULATOR **********");

        do{
            System.out.println("Please enter the length of Carpet :");
            length = scan.nextLine();
            validator = validator(length);

        }while (validator == false);


        do{
            System.out.println("Please enter the width of Carpet :");
            width = scan.nextLine();
            validator = validator(width);
        }while (validator == false);

        do{
            System.out.println("Please select : 1) Economic 2) Luxury");
            choice = scan.nextLine();
            validator = validator(choice);

        }while (validator == false);

        int_Length = Integer.parseInt(length);
        int_Width = Integer.parseInt(width);
        int_Choice = Integer.parseInt(choice);

        total = Calculator(int_Length , int_Width , int_Choice);

        System.out.println("Total cost is " + total + " " + "$");

    }

    public static double Calculator(int num1, int num2 , int choice){
        int meter = num1 * num2 ;
        double total = 0;


        if(choice == 1){
            total = meter * 7.9;
        }else if(choice == 2){
            total = meter * 20;
        }

        return total;
    }


    public static boolean validator(String value){

        int int_Value;
        try{
            int_Value = Integer.parseInt(value);
            return true;
        } catch (Exception ex){
            System.out.println("Please enter a numeric number only " + ex.getMessage());
            return false;
        }
    }
}
