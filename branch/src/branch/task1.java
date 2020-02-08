package branch;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//値入力
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		//if文
		System.out.println("10以上の数字を入力してください");
		System.out.println(a);
		System.out.print("値：");
		if(a >= 10) System.out.println(a);
		if(a < 10) System.out.println(a * 10);

	}

}