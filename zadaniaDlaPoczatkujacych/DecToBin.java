package zadaniaDlaPoczatkujacych;
import static zadaniaDlaPoczatkujacych.ArrayFactory.getBinary;
import java.util.Scanner;
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int value = sc.nextInt();
        System.out.println("Jej postac binarna to:");
        getBinary(value);

    }
}
