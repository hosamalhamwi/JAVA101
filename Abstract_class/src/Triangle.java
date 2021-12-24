public class Triangle extends Shape{


    public Triangle(int height, int base, int hypotenuse) {
        super(height, base, hypotenuse);
        setName("Triangle");
    }

    @Override
    public double calculateArea() {
        return (a*b)/2.0;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}
