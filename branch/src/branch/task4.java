package branch;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
        int numB = sc.nextInt();

        //if-else if-else文
        
        //条件1 正の数であるか
        if(numA <= 0 || numB <= 0){
        	System.out.println("numA:" + numA);
        	System.out.println("numB:" + numB);
        	System.out.println("正の整数を入力してください");

        //条件2 numBはnumAの約数であるか
        }else if(numA % numB == 0) {
        	System.out.println("numA:" + numA);
        	System.out.println("numB:" + numB);
        	System.out.println("numBはnumAの約数です");
        }else{
        	System.out.println("numA:" + numA);
        	System.out.println("numB:" + numB);
        	System.out.println("numBはnumAの約数ではありません");
        }

	}

}
