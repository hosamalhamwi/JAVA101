public class Animal {

    protected int age;
    protected boolean isDomestic;
    protected String breed;

    public Animal(){}

    public Animal(int a, boolean isD){
        this.age = a;
        this.isDomestic = isD;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void move(){
        System.out.println("Moving");
    }
}
