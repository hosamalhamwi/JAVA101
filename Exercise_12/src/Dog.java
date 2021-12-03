public class Dog {


    private int age;
    private String breed;
    private String name ;


    public Dog(int age , String breed){
       this.breed = breed ;
       this.age = age ;
   }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String breed, int age){
       this.breed = breed;
       this.age = age;

   }

   public void setName(String name){
        this.name = name ;
   }

   public String getName(){
        return name;
   }

   public void bark(){
        System.out.println("\n Woor Woor");
   }




}
