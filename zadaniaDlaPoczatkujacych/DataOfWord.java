package zadaniaDlaPoczatkujacych;

import java.util.Scanner;
import static zadaniaDlaPoczatkujacych.ArrayFactory.checkPalindrom;
import static zadaniaDlaPoczatkujacych.ArrayFactory.getReverseString;
public class DataOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dowolne słowo:");
        String word = sc.next();
        System.out.println("Długość: " + word.length());
        checkPalindrom(word);
        System.out.format("Odwrócone słowo: ");
        System.out.println(getReverseString(word));
    }
}
