package zadaniaDlaPoczatkujacych;
import java.lang.Math;


public class Rectangle {
    private float a,b;

    Rectangle(float a, float b){
        this.a=a;
        this.b=b;
    }

    private float getA(){
        return a;
    }
    private float getB(){
        return b;
    }
    public float getPerimeter(){
        return 2*(a+b);
    }
    public float getArea(){
        return a*b;
    }
    private double getDiagonal(){
        return Math.sqrt(a*a+b*b);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(16,10);
        Rectangle rectangle2 = new Rectangle(6,8);
        System.out.println("Obwód: " + (int)rectangle1.getPerimeter() + " Pole: " + (int)rectangle1.getArea() + " Przekątna: " + (int)rectangle1.getDiagonal());
        System.out.println("Obwód: " + (int)rectangle2.getPerimeter() + " Pole: " + (int)rectangle2.getArea() + " Przekątna: " + (int)rectangle2.getDiagonal());
    }
}
