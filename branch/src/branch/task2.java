package branch;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//整数の入力
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		//if文
		System.out.println("数字を入力してください");
		System.out.println(a);
		if(a >= 10) System.out.println("値:" + a);
		if(a < 10) System.out.println("値:" + "0" + a);
	}

}
