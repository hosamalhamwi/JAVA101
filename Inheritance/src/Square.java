public class Square extends Shape{
    public Square(int a){
        super(a);
    }

    @Override
    public double calculateArea() {
       double area = a*a;
       return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 4*a;
        return perimeter;
    }
}
