public abstract class Animal {
    String breed;
    int age;

    public Animal(String b , int a){
        this.breed = b;
        this.age = a;
    }

    public abstract void sleep();
    public abstract void move();
    public abstract void eat();

}
