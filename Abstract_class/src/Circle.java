public class Circle extends Shape {

    private final double PI = 3.14;

    public Circle(int r) {
        super(r);
        setName("Circle");
    }

    @Override
    public double calculateArea() {
       return r*r*PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*r;
    }
}
