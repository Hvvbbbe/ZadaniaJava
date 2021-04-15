package zadaniaDlaPoczatkujacych;

public class MyNumber {
    private double number;

    private MyNumber(double number){
        this.number=number;
    }
    private boolean isOdd(){
        return number%2!=0;
    }
    private boolean isEven(){
        return number%2==0;
    }
    private double sqrt(){
        return Math.sqrt(number);
    }
    private double pow(int x){
        return Math.pow(number,x);
    }
    private double add(double x){
        return number += x;
    }
    private double substract(double x){
        return number -= x;
    }

    public static void main(String[] args) {
        MyNumber value = new MyNumber(25);
        System.out.println(value.isEven());
        System.out.println(value.isOdd());
        System.out.println(value.sqrt());
        System.out.println(value.pow(2));
        System.out.println(value.add(20));
        System.out.println(value.substract(26));

    }
}
