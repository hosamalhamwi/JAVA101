import javax.swing.*;

public class main {
    public static void main(String[] args) {

        String message;

        //Animal Class
        Dog bobby = new Dog(5,true);
        bobby.setBreed("Husky");
        bobby.birthday();
        bobby.move();

        Bird bird = new Bird();
        bird.setAge(2);
        bird.setBreed("Robin");

        message="Bobby age " + bobby.getAge() + "\nBobby breed " + bobby.getBreed() + " \nDomestic " + bobby.getIsDomestic() +
            "\n\nBird age " + bird.getAge() + "\nBird Breed" + bird.getBreed() + "\nDomestic " + bird.getIsDomestic();



        //Shape Class

        Square s = new Square(5);
        s.setName("Square");
        Rectange r = new Rectange(5,4);
        r.setName("Reactangle");
        Circle c = new Circle(5);
        c.setName("Circle");

        Shape shapesArray [] = {s,r,c};

        for(Shape eachShape : shapesArray){
            message+= "\nShape Name : " + eachShape.getName()+ " Area= " + eachShape.calculateArea() + "\n";
            message+= "Shape Name : " + eachShape.getName()+ " Area= " + eachShape.calculatePerimeter() + "\n";
            message+= ".............................................. \n";
        }


        //Owner and Pet

        Owner owner = new Owner("Jack Black");
        Dog2 dog = new Dog2("Golden Retriever" , 5);
        dog.setName("Max");
        dog.setOwner(owner);
        dog.adoptionComplete();
        dog.eat("Biscuits");
        dog.sleep(7);
        dog.birthday();
        dog.move("home" , "park");

        message+="Dog name " + dog.getName() + "\nDog breed " + dog.getBreed() +"\nDog Age" + dog.getAge()+"\nOwner " + dog.getOwnerName();

        JOptionPane.showMessageDialog(null,message);


    }
}
