package zadaniaDlaPoczatkujacych;

import java.util.Scanner;

import static zadaniaDlaPoczatkujacych.ArrayFactory.bubbleSort;
import static zadaniaDlaPoczatkujacych.ArrayFactory.showArray;
public class SortedTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy:");
        int n=sc.nextInt();
        int [] arrayN = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Podaj " + (i+1) +"-ty element tablicy" );
            arrayN[i]=sc.nextInt();
        }
        bubbleSort(arrayN);
        showArray(arrayN);
    }
}
