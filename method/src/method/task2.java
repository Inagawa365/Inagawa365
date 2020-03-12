package method; //新課題番号1

public class task2 {

    public static void main(String[] args) {

        myPlofile("コラボ");
        int age = 30;
        myPlofile(age);
        float height = 178.0F;
        myPlofile(height);
    }

    public static void myPlofile(String name) {
        System.out.println("私の名前は"+ name +"です。");
    }
    public static void myPlofile(int age) {
        System.out.println("年齢は"+ age +"です。");
    }
    public static void myPlofile(float height) {
        System.out.println("身長は" + height + "です。");
    }
}
