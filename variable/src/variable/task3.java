package variable;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("変換前");

		int intNum = 219;
		System.out.println(intNum);

		double doubleNum = 364.2;
		System.out.println(doubleNum);

		long longNum = 123456L;
		System.out.println(longNum);

		System.out.println("変換後");

		//intNumをlong型に変換
		long a = (long)intNum;
		System.out.println(a);

		//doubleNumをfloat型に変換
		float b = (float)doubleNum;
		System.out.println(b);

		//longNumをdouble型に変換
		double c = (double)longNum;
		System.out.println(c);
	}

}
