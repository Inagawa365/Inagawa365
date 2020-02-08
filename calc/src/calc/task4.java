package calc;

public class task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//整数A
		int a;
		a = 192837;

		//一の位を除く数
		a = a/=10;
		System.out.print("一の位を除く数:");
		System.out.println(a);

		//整数B
		int b;
		b = 192837;

		//一の位の数
		b = b%=10;
		System.out.print("一位の数:");
		System.out.println(b);

	}

}
