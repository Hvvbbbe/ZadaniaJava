package zadaniaDlaPoczatkujacych;
import java.util.Scanner;
import java.lang.Math;
public class Methods {
    Scanner scanner = new Scanner(System.in);
    public double getAge(){
        System.out.println("Podaj swoj aktualny wiek: ");
       return scanner.nextDouble();
    }
    public String getName(){
        System.out.println("Podaj swoje imie:");
        return scanner.next();
    }
    public void getFew(int one,int two){
        int suma = one + two;
        int roznica = one - two;
        int iloczyn = one * two;
        System.out.println("Suma = " + suma + " roznica = " + roznica + " iloczyn = " + iloczyn );
    }
    public boolean ifEven(int number){
        return number%2==0;
    }
    public boolean ifDiv(int number){
        return number%3==0 && number%5==0;
    }
    public double triple(int number){
        return number*number*number;
    }
    public double getSqrt(double number){
        return Math.sqrt(number);
    }
    public boolean ifTriangleCanBeBuilt(int a,int b, int c){
        return a*a+b*b==c*c || a*a+c*c==b*b || c*c+b*b==a*a;
    }

    public static void main(String[] args) {
        Methods method1 = new Methods();
      //  System.out.println("Twój aktualny wiek to " + (int)method1.getAge() + " lata.");
      //  System.out.println("Twoje imie to: " + method1.getName());
      //  method1.getFew(5,2);
      //  System.out.println(method1.ifEven(6));
      //  System.out.println(method1.ifDiv(15));
      //  System.out.println(method1.triple(6));
      //  System.out.println(method1.getSqrt(25));
      //  System.out.println(method1.ifTriangleCanBeBuilt(3,4,5));
    }
}
