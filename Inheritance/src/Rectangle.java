public class Rectangle extends Shape{


    public Rectangle(int a, int b){
        super(a,b);
    }

    public Rectangle(){
        super();
    }

    @Override
    public double calculateArea() {
        double area = a*b;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2*(a+b);
        return perimeter;
    }
}
