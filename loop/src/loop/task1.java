package loop;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        System.out.print("数字を入力してください: "); //入力を受付
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();

        //1からnumAまでのloop処理
		int sum = 0;
        for(int i =1; i <= numA; i++) {
            sum += i;
        }
        System.out.println( "1～" + numA + "までの合計:"+ sum);
    }
}
