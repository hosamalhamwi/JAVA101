import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Dog bobby = new Dog(5 , true);

        bobby.setName("Bobby");
        bobby.setBreed("Husky");
        bobby.birthday();

        System.out.println(bobby.getName()+ " is" + bobby.getAge()+ " yaers old");

        Bird bird = new Bird();
        bird.setAge(2);
        bird.setBreed("Robin");
        bird.move();



        System.out.println(bird.getBreed()+ " is" + bobby.getAge()+ " yaers old");

        //shape

        Square s = new Square(5);
        s.setName("Square");
        Rectangle r = new Rectangle(2,4);
        r.setName("Rectangle");
        Circle c = new Circle(5);
        c.setName("Circle");


        Shape shapesArray [] = {s,r,c};

        String output = "";

        for(Shape eachShape : shapesArray){
            output+= "Shape Name : " + eachShape.getName()+ " Area= " + eachShape.calculateArea() + "\n";
            output+= "Shape Name : " + eachShape.getName()+ " Area= " + eachShape.calculatePerimeter() + "\n";
            output+= ".............................................. \n";
        }

        JOptionPane.showMessageDialog(null,output);


    }
}
