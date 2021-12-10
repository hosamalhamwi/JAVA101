public class Dog extends Animal{
    private String name;

    public Dog(int a , boolean isD){
        super(a,isD);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void birthday(){
        this.age+=1;
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }
}
