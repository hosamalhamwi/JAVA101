public abstract class Pet implements DomesticAnimal{

    protected int age;
    protected String breed;
    protected Owner owner;

    Pet(String breed, int age){
        this.breed = breed;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getBreed(){
        return this.breed;
    }

    public void birthday(){
        this.age += 1;
    }

    public abstract void adoptionComplete();

    public void setOwner(Owner owner){
        this.owner = owner;
    }

    public String getOwnerName(){
        return this.owner.getName();
    }
}
