package zadaniaDlaPoczatkujacych;

import java.util.Scanner;

public class ChristmassTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz liczbe rzedow:");
        int number = sc.nextInt();
        String a="*";
        for(int i=0;i<number;i++){
            for(int j=0; j < 2*i+1 ; j++){
                if(i==0){
                    System.out.println(a);
                }
                a=a+a+a;
                System.out.println(a);
            }
        }

        //2n+1
    }
}
