public class Dog extends Animal{
    private String breed;
    private String name;

    Dog(int a, boolean isD){
        super(a,isD);
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

    public void birthday(){
        super.age +=1;
    }

    @Override
    public void move(){
        System.out.println("Dog moves");
    }
}
