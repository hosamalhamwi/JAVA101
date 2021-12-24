public abstract class Shape {
    protected String name;
    protected int a,b,c;
    protected int r;



    //you have to use one of the constructor in child class : must
    Shape(int r){
        this.r = r;
    }

    Shape(int a , int b){
        this.a = a;
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Shape(int a , int b , int c){
        this.a = a;
        this.b =b;
        this.c = c;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();


}
