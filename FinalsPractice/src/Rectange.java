public class Rectange extends Shape{

    Rectange(int a, int b){
        super(a,b);
    }

    @Override
    public double calculateArea(){
        double area = a*a;
        return area;
    }

    @Override
    public double calculatePerimeter(){
        double perimeter = 2*(a+b);
        return perimeter;
    }

}
