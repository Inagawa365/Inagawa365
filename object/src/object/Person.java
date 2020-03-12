package object;

public class Person {

    private String name;
    private int age;
    static int wallet;

    public Person(String name){
        this.setName(name);
        System.out.println("私の名前は" + name + "です。");
    }

    public Person(int age){
        this.setAge(age);
        System.out.println("私の年齢は" + age + "です。");
    }

    //引数がない場合のエラーに対処する
    Person(){

    }

    public static void main(String[] args){

        Person namae = new Person("稲川和樹");
        Person nenrei = new Person(27);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
