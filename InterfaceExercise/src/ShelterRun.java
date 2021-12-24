public class ShelterRun {
    public static void main(String[] args) {
        Owner owner = new Owner("Jack Black");

        Dog dog = new Dog(5 , "Golden Retriever");
        dog.setName("Max");
        dog.setOwner(owner);

        dog.adaptionCompleted();
        dog.eat("Dog biscuits");
        dog.sleep(7);
        dog.move("Home" , "Park");
        dog.birthday();



    }
}
