package zadaniaDlaPoczatkujacych;

import java.util.LinkedList;
import java.util.Scanner;

public class ArrayFactory {
    private int x;
    private ArrayFactory(int x){
        this.x=x;
    }
    private int[] oneDimension(){
        return new int[x];
    }
    private int[][] twoDimensions(){
        return new int[x][x];
    }
    private int[][] ones(){
        int[][] newArray =new int[x][x];
        for(int i=0;i< x;i++){
            newArray[i][i]=1;
        }
        return newArray;
    }
    private static void getSoloNumbers(int value){
        if (value/100 > 0) {
            int one = value / 100; //1
            int two = (value - one * 100) / 10; //2
            int three = value - one * 100 - two * 10;  //3
            System.out.println(three);
            System.out.println(two);
            System.out.println(one);
        } else {
            int two = value / 10; //2
            int three = value - two * 10;  //3
            System.out.println(three);
            System.out.println(two);
        }
    }
    public static char[] getReverseString(String word) {
        char[] newWord = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            newWord[i] = word.charAt(word.length() - 1 - i);
            //    System.out.println(word.charAt(word.length()-1-i));
        }
        //System.out.println(newWord);
        //System.out.println(word.length());
        newWord.toString();
        return newWord;
    }
    public static void getBinary(int value){
        int i=0;
        String binaryNumber="";
        while(value>0){
            binaryNumber += value % 2;
            value /= 2;
        }
        System.out.println(getReverseString(binaryNumber));
    }
    public static void checkPalindrom(String word){
        char[] newWord = word.toCharArray();
        String check = "";
        for (int i=0;i<word.length()/2; i++){
            if(newWord[i]==newWord[word.length()-1-i]){
                check += "t";
            }else {
                check += "f";
            }
        }
        if(check.contains("f")){
            System.out.format("Słowo %s nie jest palindromem. \n",word);
        }else{
            System.out.format("Słowo %s jest palindromem. \n",word);
        }
    }
    private static boolean isPalindromev2(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char currentLetter = chars[i];
            char correspondantLetterFromEnd = chars[chars.length - i - 1];
            if (! (currentLetter == correspondantLetterFromEnd)) {
                return false;
            }
        }
        return true;
        //return word.equals(reverse(word));
    }
    public static void showArray(int[] array){
        System.out.format("[");
        for (int i=0;i<array.length;i++){
            if (i==0){}else {
                System.out.format(",");
            }
            System.out.format("%s",array[i]);
        }
        System.out.format("]");
    }
    public static int[] bubbleSort(int[] array) {
        int temp, n = array.length;
        do {
            for (int i = 0; i < n - 1; i++)
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            n -= 1;
        } while (n > 1);
        return array;
    }
        private static void bubbleSortv2(int[] array) {
            for (int i = 0; i < array.length; i++) {
                for (int current = 0; current < array.length - 1 - i; current++) {
                    int next = current + 1;
                    if (array[current] > array[next]) {
                        int tmp = array[next];
                        array[next] = array[current];
                        array[current] = tmp;
                    }
                }
            }
        }
    public static void main(String[] args) {
        getSoloNumbers(597);
        getReverseString("pies");
        getBinary(359);
        checkPalindrom("kajak");
        System.out.println(isPalindromev2("kajka"));
        ArrayFactory sample = new ArrayFactory(3);
        System.out.println(sample.ones());
        showArray(sample.oneDimension());
        int[] example= new int[]{1,6,5,3,9,7,4};
        //showArray(bubbleSort(example));
        bubbleSortv2(example);
        showArray(example);

    }
}
