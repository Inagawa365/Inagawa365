package loop;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        System.out.print("正の整数を入力してください： "); //入力を受付

        Scanner sc = new Scanner(System.in);
        int numA  = sc.nextInt();
        int sum = 0;

        System.out.print(numA + "の約数:");

        //1からnumAまでを代入し、割り切れればtrue
        for(int i = 1; i <= numA; i++){
            if(numA % i == 0){
                sum += 1;
                System.out.print(i); //代入結果の表示
                if(i < numA){
                    System.out.print(",");  //numA前までの数字の後に","を表示
                }
            }
       }
   }
}