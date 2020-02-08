package calc;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//整数の入力受付
		Scanner sc = new Scanner(System.in);
		int inputA = sc.nextInt();
		int inputB = sc.nextInt();
		int inputC = sc.nextInt();

		//整数の実行結果
		System.out.println(inputA);
		System.out.println(inputB);
		System.out.println(inputC);

		//入力整数の加算
		System.out.print("合計値：");
		System.out.println(inputA+inputB+inputC);

		//数値3.0
		double doubleNum = 3.0;

		//平均(3で割った時)
		int a = (int)doubleNum;
		System.out.print("平均(3で割った時):");
		System.out.println((inputA+inputB+inputC)/a);

		//平均(3.0で割った時)
		double b = doubleNum;
		System.out.print("平均(3.0で割った時)：");
		System.out.println((inputA+inputB+inputC)/b);

	}

}
