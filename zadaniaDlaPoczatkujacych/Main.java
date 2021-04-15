package zadaniaDlaPoczatkujacych;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj promien kola:");
        figures[0] = new Circle(sc.nextDouble());
        System.out.println("Podaj pierwsza przyprostokatna:");
        double p1 = sc.nextDouble();
        System.out.println("Podaj druga przyprostokatna:");
        double p2 = sc.nextDouble();
        figures[1] = new Triangle(p1,p2);
        System.out.println("Podaj jeden bok prostokąta:");
        double a = sc.nextDouble();
        System.out.println("Podaj drugi bok prostokąta:");
        double b = sc.nextDouble();
        figures[2] = new Rectanglev2(a,b);
        for (Figure figure: figures){
            System.out.println("figura:" + figure.getType() + " obwod: " + figure.getPerimeter() + " pole: " + figure.getArea());
        }
    }
}
