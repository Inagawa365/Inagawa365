package calc;

public class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//合計値
		System.out.print("合計：");
		int a = 10;
		int b = 12;
		int c = 13;
		System.out.println(a+b+c);

		//数値3.0
		double doubleNum = 3.0;

		//平均(３で割った時)
		int d = (int)doubleNum;
		System.out.print("平均(３で割った時)：");
	    System.out.println((a+b+c)/d);

	    //平均(3.0で割った時)
	    double e = doubleNum;
	    System.out.print("平均(3.0で割った時):");
        System.out.println((a+b+c)/e);

	}

}
