package object;

public class Main {

    public static void main(String[] args) {
        //課題2のmainメソッド
        //インスタンスを生成
        Person hoge01 = new Person(1000);
        Person hoge02 = new Person(2000);

        System.out.println("インスタンスhoge01でwalletにアクセス");
        System.out.println(hoge01.wallet);
        System.out.println("インスタンスhoge02でwalletにアクセス");
        System.out.println(hoge02.wallet);
        System.out.println("クラスPersonでwalletにアクセス");
        System.out.println(Person.wallet);

        System.out.println();//改行

        //課題4のmainメソッド
        Animal pet0 = new Animal();
        Dog pet1 = new Dog("ポチ", 5);
        Dog pet2 = new Dog(12.3);

        System.out.println("名前:" + pet1.name);
        System.out.println("年齢:" + pet1.age + '歳');
        System.out.println("体重:" + pet2.weight + "kg");
        pet1.run();
        pet0.sleep();
        pet1.sleep();


    }

}
