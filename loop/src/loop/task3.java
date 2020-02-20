package loop;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long lo = sc.nextLong();
		System.out.println("数字を入力してください:" + lo);

		int keta = 0;
		while(lo > 0) {
			keta ++;
			lo = lo / 10;
		}
		System.out.println("桁数:" + keta);
	}

}
