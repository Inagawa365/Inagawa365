package object;

public class Person {

    //フィールド
    private String name;
    private int age;

    //静的フィールド
    static int wallet;

    //コンストラクタ
    public Person(String name, int age){
        this.name = name;
        this.age = age;
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

    public void myPlofile() {
        System.out.println("私の名前は" + this.name + "です");
        System.out.println("私の年齢は" + this.age + "です");
    }
}
