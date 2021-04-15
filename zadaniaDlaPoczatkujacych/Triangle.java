package zadaniaDlaPoczatkujacych;

public class Triangle implements Figure{
    public double a,b,c;
    public Triangle(double a, double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public double getPerimeter() {
        double c=Math.sqrt(a*a+b*b);
        return a+b+c;
    }

    @Override
    public double getArea() {
        return a*b/2;
    }

    @Override
    public String getType() {
        return "triangle";
    }
}
