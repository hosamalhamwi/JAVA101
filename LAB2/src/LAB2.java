public class LAB2 {
    public static void main(String[] args) {

        Man man = new Man("blue" , 80 , 178);
        Man caveMan = new Man("red" , 75 , 180 );
        Man rider = new Man("black" , 67 , 186);

        man.setName("Normal Man");
        caveMan.setName("Cave Man");
        rider.setName("Rider Man");

        Man[] manArray = {man , caveMan , rider};
        int counter = 0;

        for(Man eachman : manArray){
            counter+=1;
            System.out.println(".................................................................................");
            System.out.println(eachman.getName() + " Informations is : \n Eye Color : " + eachman.getEyeColor() + " \n Weight : " + eachman.getWeight() +  "  \n Height : " + eachman.getHeight() );
            System.out.println(".................................................................................  \n ");
        }






    }
}
