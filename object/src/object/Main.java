package object;

public class Main {

    public static void main(String[] args) {

        Animal pet = new Animal("ポチ", 5);
        Dog petWeight = new Dog(12.3);

        System.out.println("名前:" + pet.name);
        System.out.println("年齢:" + pet.age + '歳');
        System.out.println("体重:" + petWeight.weight + "kg");
        System.out.print(pet.name + 'は');
        petWeight.run();
        System.out.print(pet.name + 'は');
        pet.sleep();
    }
}
