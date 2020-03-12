package method; //新課題番号3

public class task4 {

    public static void main(String[] args) {

        System.out.println("－－－①文字列のみの場合－－－");
        System.out.println(add("文字列1","文字列2"));
        System.out.println("－－－②整数のみの場合－－－");
        System.out.println(add(3, 5));
        System.out.println("－－－①小数の場合－－－");
        System.out.println(add(3.5, 5.5));
    }

    public static String add(String letter1, String letter2) {
        return letter1 + letter2;
    }

    public static int add(int integer1, int integer2) {
        return integer1 + integer2;
    }

    public static double add(double flaction1, double flaction2) {
        return flaction1 + flaction2;
    }
}
