package object;

public class Dog extends Animal{

    double weight; //フィールドの追加

    public Dog(String name, int age) {
        super(name, age);
    }
    public Dog(double weight){
        this.weight = weight; //コンストラクタの追加
    }

    //メソッドを生成
    public void run(){
        System.out.println(name + "は走った");
    }

    @Override
    public void sleep(){
        System.out.println(name + "は眠った");
    }
}
