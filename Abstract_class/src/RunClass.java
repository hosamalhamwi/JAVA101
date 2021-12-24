import javax.swing.*;

public class RunClass {
    public static void main(String[] args) {
        String output = "";

        Circle c = new Circle(5);

        Rectangle r = new Rectangle(2,4);

        Triangle t = new Triangle(2,4,6);

        Shape [] shapes = {c,t,r};

        for(Shape eachShape : shapes){
            output +="Shape Name : \n" + eachShape.getName();
            output +="Shape Area : \n" + eachShape.calculateArea();
            output +="Shape Perimeter : \n" + eachShape.calculatePerimeter();
        }

        JOptionPane.showMessageDialog(null ,output);
    }
}
