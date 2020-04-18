package object;

public class Dog extends Animal{

    double weight; //フィールドの追加

    public Dog(String name, int age, double weight) {
        super(name, age);
        this.weight = weight; //コンストラクタの追加
    }

    //メソッドを生成
    public void run(){
        System.out.println(this.name + "は走った");
    }

    @Override
    public void sleep(){
        System.out.print(this.name + 'は');
        super.sleep();
    }
}
