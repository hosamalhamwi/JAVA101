public class Pi {
    public static void main(String[] args) {

        double piValue = 4.0;
        double footer = 3.0 ;

        int times = 15;
        int counter = 1;

        while(times >= counter){

            piValue = piValue - (4/footer) + (4/(footer+2));

            counter++;
            footer = footer + 4;
        }

        System.out.println(piValue);


    }
}
