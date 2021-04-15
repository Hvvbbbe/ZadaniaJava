package zadaniaDlaPoczatkujacych;

public class Rectanglev2 implements Figure{
    double a,b;
    public Rectanglev2(double a, double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public double getPerimeter() {
        return 2*a+2*b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String getType() {
        return "recatngle";
    }
}
