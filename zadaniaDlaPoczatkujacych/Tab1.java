package zadaniaDlaPoczatkujacych;

public class Tab1 {
    private static String[] fiveFirstLetters(){
        return new String[]{"a","b","c","d","e"};
    }
    private static String[] reverseTab(String[] array){
        return new String[]{array[2],array[1],array[0]};
    }

    public static void main(String[] args) {
        fiveFirstLetters();
        reverseTab(new String[]{"a","b","c"});

    }
}
