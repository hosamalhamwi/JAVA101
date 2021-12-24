public class Cat extends Animal implements Mamal , Carnivore{
    public Cat(String b, int a) {
        super(b, a);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }

    @Override
    public boolean isWarmBlood() {
        return false;
    }
}
