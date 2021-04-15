package zadaniaDlaPoczatkujacych;

public class Human {

    private Integer age, height;
    private String name;
    private boolean ifMan;

    private Human(Integer age, Integer height, String name, boolean ifMan){
        this.age=age;
        this.height=height;
        this.name=name;
        this.ifMan=ifMan;
    }
    private int getAge(){
        return age;
    }
    private int getHeight(){
        return height;
    }
    private String getName(){
        return name;
    }
    private String getSex(boolean ifMan){
        if(ifMan == true){
            return "man";
        }
        return "woman";
    }

    public static void main(String[] args) {
        Human human1 = new Human(17,178,"Jacek", true);
        Human human2 = new Human(19,170,"Ewa", false);
        System.out.println("To jest: " + human1.getName()+ " ma płeć: " + human1.getSex(human1.ifMan));
        System.out.println("A to jest: " + human2.getName());
    }
}


