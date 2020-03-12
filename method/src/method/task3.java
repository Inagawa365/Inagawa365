package method; //新課題番号2

public class task3 {

    public static void main(String[] args) {

        double triangle = getTriangleArea(45.10, 5.99);
        System.out.println("三角形の面積");
        System.out.println(triangle);
    }

    public static double getTriangleArea(double base, double height) {
        double area = (base * height) / 2;
        return Math.round(area);
    }
}
