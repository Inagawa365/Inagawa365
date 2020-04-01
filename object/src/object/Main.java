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
        Dog pet = new Dog(12.3);

        System.out.println("名前:" + pet.name);
        System.out.println("年齢:" + pet.age + '歳');
        System.out.println("体重:" + pet.weight + "kg");
        System.out.print(pet.name + 'は');
        pet.run();
        System.out.print(pet.name + 'は');
        pet.sleep();
    }

}
