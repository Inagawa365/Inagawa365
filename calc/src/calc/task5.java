package calc;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//文字列、文字列以外での結合
		String a = ("ノートPCの値段：");
		long b = 89800L;
		char c = ('円');
		System.out.println(a+b+c);

		//文字入力
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1+str2);

   }

}
