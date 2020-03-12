package instance;

public class task3 {

    public static void main(String[] args) {

        //インスタンスの生成とフィールドに値を設定
        Person person = new Person();
        person.name = "稲川 和樹";
        person.age = 27;

        //PersonクラスのmyPlofileメソッドを呼び出す
        person.myPlofile();
    }
}
