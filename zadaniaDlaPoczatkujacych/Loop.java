package zadaniaDlaPoczatkujacych;

public class Loop {
    private static void getNumbersToX(int x){
        int counter = 0;
        while(counter!=x+1){
            System.out.println(counter);
            counter++;
        }
    }
    private static void getNumbersToXfor(int x){
        for (int i=0;i<x+1;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        getNumbersToX(5);
        getNumbersToXfor(5);
    }
}
