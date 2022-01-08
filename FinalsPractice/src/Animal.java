public class Animal {
    protected int age;
    protected boolean isDomestic = false;
    protected String breed;

    Animal(){}

    Animal(int a , boolean isD){
        this.age = a;
        this.isDomestic = isD;
    }

    public void setIsDomestic(boolean d){
        this.isDomestic = d;
    }

    public void setAge(int a){
        this.age = a;
    }

    public int getAge(){
        return this.age;
    }

    public void setBreed(String b){
        this.breed = b;
    }

    public String getBreed(){
        return this.breed;
    }

    public boolean getIsDomestic(){
        return this.isDomestic;
    }

    public void move(){
        System.out.println("animal moves");
    }
}
