package object;

public class Dog extends Animal{

    double weight; //フィールドの追加

    public Dog(double weight){
        super("ポチ", 5); //Animalクラスのコンストラクタを呼び出す
        this.weight = weight; //コンストラクタの追加
    }

    //メソッドを生成し、Animalクラスのメソッドをオーバライドする
    public void run(){
        System.out.println("走った");
        super.sleep();
    }
}
