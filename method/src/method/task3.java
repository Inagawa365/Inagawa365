package method;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double triangle = task3(45.0, 6.0);
		System.out.println("三角形の面積");
		System.out.println(triangle);
	}

	public static double task3(double x, double y) {
		double area = (x * y) / 2;
		return area;
	}
}
