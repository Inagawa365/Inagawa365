package branch;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {

		//整数入力
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = sc.nextInt();


		//条件　最大値を求める
		int max = numA;
		if(max < numB)max = numB;
		if(max < numC)max = numC;

		//出力
		System.out.println("numA:"+ numA);
		System.out.println("numB:"+ numB);
		System.out.println("numC:"+ numC);
		System.out.println("最大値は:"+ max);
	}

}
