package loop;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int numA = sc.nextInt();
		int sum = 1;

		System.out.println("数字を入力してください:" + numA);
		System.out.print(sum);

		for(int i = 2; i <= numA; i++) {
		    sum += i;

		System.out.print("+" + i);
		}
		System.out.println("=" + sum);
	}

}
