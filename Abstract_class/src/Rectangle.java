public class Rectangle extends Shape {


    public Rectangle(int a, int b) {
        super(a, b);
        setName("Rectangle");
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(a+b);
    }
}
