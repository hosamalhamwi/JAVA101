public class Shape {
    protected  int a;
    protected int b;
    protected String shapeName;

    public Shape(){}

    public Shape(int a) {
        this.a = a;
    }

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getName() {
        return shapeName;
    }

    public void setName(String shapeName) {
        this.shapeName = shapeName;
    }

    public double calculateArea(){
        return 0;
    }

    public double calculatePerimeter(){
        return 0;
    }
}
