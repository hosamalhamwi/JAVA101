public class Dog2 extends Pet {

    private String name;

    Dog2(String b , int a){
        super(b,a);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void move(String from, String to) {
        System.out.println("Runs from "+from+" to "+to);
    }

    @Override
    public void eat(String food) {
        System.out.println("Eats "+food);
    }

    @Override
    public void sleep(int hours) {
        System.out.println("Sleep "+hours+" per day");
    }

    @Override
    public void adoptionComplete() {
        System.out.println(this.name + " is adopted by" + super.owner.getName());
    }
}
