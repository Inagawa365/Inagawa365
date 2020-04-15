package object;

public class Person {

    //フィールド
    private String name;
    private int age;

    //静的フィールド
    static int wallet;

    //コンストラクタ
    public Person(String name, int age){
        name = "稲川和樹";
        age = 27;
    }

    public Person(int money){
        Person.wallet += money;
    }

    //コンストラクタに引数がない場合のエラーに対処
    public Person(){
    }

    //nane, ageのgetterとsetterの設定とカプセル化
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
