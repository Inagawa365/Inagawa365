package object;

public class Animal {

    String name;
    int age;

    //コンストラクタ
    public Animal() {};
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //sleepメソッド
    public void sleep(){
        System.out.println("眠った");
    }
}
