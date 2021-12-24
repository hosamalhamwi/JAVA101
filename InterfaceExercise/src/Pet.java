public abstract class Pet implements DomesticAnimal {
    protected int age;
    protected String breed;
    protected  Owner owner;

    public Pet(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void birthday(){
        this.age+=1;
    }

    public abstract void adaptionCompleted();

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


}
