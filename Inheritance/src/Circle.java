public class Circle extends Shape{
    private double pi = 3.14;

    public Circle(int i){
        super(i);
    }

    @Override
    public double calculateArea() {
        double area = pi*a*a;
        return area;
    }

    @Override
    public double calculatePerimeter() {
       double perimeter = 2*pi*a;
       return perimeter;
    }
}
