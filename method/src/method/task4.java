package method;

public class task4 {

	public static void main(String[] args) {

		System.out.println("－－－①文字列のみの場合－－－");
		System.out.println(overload("文字列1","文字列2"));
		System.out.println("－－－②整数のみの場合－－－");
		System.out.println(overload(3, 5));
		System.out.println("－－－①小数の場合－－－");
		System.out.println(overload(3.5, 5.5));
	}

	public static String overload(String x, String y) {
	  return x + y;
	}

	public static int overload(int x, int y) {
	  return x + y;
	}

	public static double overload(double x, double y) {
	  return x + y;
	}
}
