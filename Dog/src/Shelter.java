public class Shelter {
    public static void main(String[] args) {

        Dog mike = new Dog(2 , "Husky");

        mike.setName("Mike");

        Dog pitbull = new Dog(5 , "Pitbull");

        Dog []dogArray = {mike, pitbull};
        int counter = 0 ;

        for(Dog eachDog : dogArray){
            System.out.println("Dog " + (counter+1) + " Information " + eachDog.getName() + " Age: " + eachDog.getAge() + " Breed:" + eachDog.getBreed() + " ");
            eachDog.bark();
        }

    }
}
