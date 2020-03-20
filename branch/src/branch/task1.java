package branch;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        //入力受付の注意文を表示
        System.out.println("10以上の数字を入力してください");

        //値入力
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //if文
        System.out.print("値：");
        if(a < 10){
            a = a * 10; //入力された数字が一桁の時のみ10倍する
        }
        System.out.println(a);
    }
}